package zfsoft.service.svcinterface;



import common.log.Subsystem;

import java.util.List;

/**
 * 子系统操作service
 *
 * @author gonghui
 * 2014-5-15
 */
public interface SubsystemService {

	public List<Subsystem> queryAllEnabledAndDefaultOrder();
}
