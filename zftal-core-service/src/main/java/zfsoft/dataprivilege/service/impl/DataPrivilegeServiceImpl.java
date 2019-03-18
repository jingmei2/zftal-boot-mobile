package zfsoft.dataprivilege.service.impl;

import zfsoft.dataprivilege.dao.IDataPrivilegeDao;
import zfsoft.dataprivilege.dto.AbstractFilter;
import zfsoft.dataprivilege.entity.DataPrivilege;
import zfsoft.dataprivilege.filter.IDealFilter;
import zfsoft.dataprivilege.service.IDataPrivilegeService;
import zfsoft.dataprivilege.util.ResourceUtil;
import zfsoft.dataprivilege.xentity.Context;

import java.util.List;


public abstract class DataPrivilegeServiceImpl implements IDataPrivilegeService {
	private IDataPrivilegeDao dataPrivilegeDao = null;

	public void setDataPrivilegeDao(IDataPrivilegeDao dataPrivilegeDao) {
		this.dataPrivilegeDao = dataPrivilegeDao;
	}

	public DataPrivilege getDataPrivilegeById(DataPrivilege query) {
		List<DataPrivilege> dataPrivileges=dataPrivilegeDao.findByQuery(query);
		if(dataPrivileges!=null&&dataPrivileges.size()>0){
			return dataPrivileges.get(0);
		}
		return null;
	}

	public AbstractFilter getValueObject(AbstractFilter filter) {
		DataPrivilege query=new DataPrivilege();
		query.setFilterId(filter.getFilterId());
		query.setRoleId(filter.getRoleId());
		query.setUserId(filter.getUserId());
		DataPrivilege dataPrivilege=getDataPrivilegeById(query);
		if(dataPrivilege==null){
			return filter;
		}
		Context context= ResourceUtil.getContextById(dataPrivilege.getFilterId());

		try {
			IDealFilter deal=(IDealFilter)Class.forName(context.getDealclass()).newInstance();

			return deal.getObjectFromXml(dataPrivilege.getXmlValue());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void saveValue(AbstractFilter filter) {
		if(filter==null){
			deleteDataPrivilege(filter);
		}
		DataPrivilege query=new DataPrivilege();
		query.setFilterId(filter.getFilterId());
		query.setRoleId(filter.getRoleId());
		query.setUserId(filter.getUserId());
		DataPrivilege dataPrivilege=getDataPrivilegeById(query);
		Context context=ResourceUtil.getContextById(filter.getFilterId());
		IDealFilter deal = null;
		try {
			deal=(IDealFilter)Class.forName(context.getDealclass()).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		if(deal==null){
			return;
		}
		if(dataPrivilege==null){
			dataPrivilege=new DataPrivilege();
			dataPrivilege.setFilterId(filter.getFilterId());
			dataPrivilege.setRoleId(filter.getRoleId());
			dataPrivilege.setUserId(filter.getUserId());
			dataPrivilege.setXmlValue(deal.getXmlFromObject(filter));
			dataPrivilegeDao.insert(dataPrivilege);
		}else{
			dataPrivilege.setXmlValue(deal.getXmlFromObject(filter));
			dataPrivilegeDao.update(dataPrivilege);
		}
	}

	@Override
	public void deleteDataPrivilege(AbstractFilter filter) {
		DataPrivilege query=new DataPrivilege();
		query.setFilterId(filter.getFilterId());
		query.setRoleId(filter.getRoleId());
		query.setUserId(filter.getUserId());
		DataPrivilege dataPrivilege=getDataPrivilegeById(query);
		if(dataPrivilege!=null){
			dataPrivilegeDao.delete(dataPrivilege);
		}
	}

	@Override
	public List<DataPrivilege> getDataPrivilege(DataPrivilege query) {
		return dataPrivilegeDao.findByQuery(query);
	}


}
