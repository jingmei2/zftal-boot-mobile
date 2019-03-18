package zfsoft.service.impl;

import common.log.Subsystem;
import zfsoft.dao.daointerface.SubsystemDao;
import zfsoft.service.svcinterface.SubsystemService;

import java.util.List;

/**
 * 子系统操作service
 *
 * @author gonghui
 * 2014-5-15
 */
public class SubsystemServiceImpl implements SubsystemService {

	private SubsystemDao subsystemDao;

	@Override
	public List<common.log.Subsystem> queryAllEnabledAndDefaultOrder() {
		Subsystem query=new Subsystem();
		query.setEnabled("1");
		query.setOrderStr("ORDER BY SEQ");
		return subsystemDao.findList(query);
	}


	public SubsystemDao getSubsystemDao() {
		return subsystemDao;
	}

	public void setSubsystemDao(SubsystemDao subsystemDao) {
		this.subsystemDao = subsystemDao;
	}

}
