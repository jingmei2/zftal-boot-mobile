package zfsoft.service.common.impl;

import zfsoft.dao.daointerface.ICommonSqlDao;
import zfsoft.dao.entities.BjdmModel;
import zfsoft.dao.entities.BmdmModel;
import zfsoft.dao.entities.NjdmModel;
import zfsoft.dao.entities.ZydmModel;
import zfsoft.service.common.ICommonSqlService;

import java.util.List;
import java.util.Map;


/**
 *
 * @author Administrator
 *
 */
public class CommonSqlServiceImpl implements ICommonSqlService {

	private ICommonSqlDao dao;

	@Override
	public List<BmdmModel> queryAllXy() throws Exception {
		return dao.queryAllXy();
	}

	@Override
	public List<ZydmModel> queryAllZy() throws Exception {
		return dao.queryAllZy();

	}

	@Override
	public List<NjdmModel> queryAllNj() throws Exception {
		return dao.queryAllNj();
	}

	@Override
	public List<BjdmModel> queryAllBj() throws Exception {
		return dao.queryAllBj();
	}


	public ICommonSqlDao getDao() {
		return dao;
	}

	public void setDao(ICommonSqlDao dao) {
		this.dao = dao;
	}

	@Override
	public List<ZydmModel> queryZydm(Map map) throws Exception {
		return dao.queryZydm(map);
	}

	@Override
	public List<BjdmModel> queryBjdm(BjdmModel model) throws Exception {
		return dao.queryBjdm(model);
	}
}
