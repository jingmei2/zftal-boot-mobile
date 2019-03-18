package zfsoft.service.impl;

import zfsoft.dao.daointerface.ILogDao;
import zfsoft.dao.entities.OperateLogModel;
import zfsoft.service.svcinterface.ILogService;

public class LogServiceImpl implements ILogService {

	private ILogDao dao;

	public ILogDao getDao() {
		return dao;
	}

	public void setDao(ILogDao dao) {
		this.dao = dao;
	}

	public void insert(OperateLogModel model) {
		dao.insert(model);
	}

}
