package zfsoft.service.impl;

import common.service.BaseServiceImpl;
import zfsoft.dao.daointerface.IGnmkDao;
import zfsoft.dao.entities.GnmkModel;
import zfsoft.service.svcinterface.IGnmkService;

import java.util.List;


/**
 *
 *
 * 类名称：GnmkServiceImpl
 * 类描述：功能模块service实现类
 * 创建人：huangxp
 * 创建时间：2012-6-28
 * 修改人：huangxp
 * 修改时间：2012-6-28
 * 修改备注：
 * @version
 *
 */
public class GnmkServiceImpl extends BaseServiceImpl<GnmkModel, IGnmkDao> implements IGnmkService {

/**
 *
 * 查询操作代码
 *
 */
 public List<GnmkModel> cxCzdm(GnmkModel model){
     return dao.cxCzdm(model);
 }

}
