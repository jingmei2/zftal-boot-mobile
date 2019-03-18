package zfsoft.service.svcinterface;


import zfsoft.dao.entities.OperateLogModel;

public interface ILogService {

	/**
	 * 往数据库插入操作日志
	 *
	 * @param bean
	 * @
	 */
	public void insert(OperateLogModel model) ;
}
