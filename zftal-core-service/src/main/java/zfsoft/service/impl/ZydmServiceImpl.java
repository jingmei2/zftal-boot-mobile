package zfsoft.service.impl;

import zfsoft.dao.daointerface.IZydmDao;
import zfsoft.dao.entities.ZydmModel;
import zfsoft.service.svcinterface.IZydmService;

import java.util.List;
import java.util.Map;


public class ZydmServiceImpl implements IZydmService {

	private IZydmDao dao;

	@Override
	public List<ZydmModel> queryModel(Map<String, String> map)
			 {
		return dao.queryModel(map);
	}

	public IZydmDao getDao() {
		return dao;
	}

	public void setDao(IZydmDao dao) {
		this.dao = dao;
	}

}
