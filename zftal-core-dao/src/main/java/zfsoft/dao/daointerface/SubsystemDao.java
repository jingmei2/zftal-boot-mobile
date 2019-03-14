package zfsoft.dao.daointerface;

import zfsoft.dao.log.Subsystem;

import java.util.List;


/**
 * 子系统操作dao
 *
 * @author gonghui
 * 2014-5-15
 */
public interface SubsystemDao{
	public List<Subsystem> findList(Subsystem query);
}
