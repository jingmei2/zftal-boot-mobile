package zfsoft.service.impl;


import zfsoft.dao.daointerface.IBjdmDao;
import zfsoft.service.svcinterface.IBjdmService;

public class BjdmServiceImpl implements IBjdmService {

	private IBjdmDao dao;

	public IBjdmDao getDao() {
		return dao;
	}

	public void setDao(IBjdmDao dao) {
		this.dao = dao;
	}



}
