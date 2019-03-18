package zfsoft.service.impl;

import common.service.BaseServiceImpl;
import zfsoft.dao.daointerface.ISjtbDao;
import zfsoft.dao.entities.YhglModel;
import zfsoft.service.svcinterface.ISjtbService;

import java.util.Map;



/**
 *
 *
 * 类名称：SjtbServiceImpl
 * 类描述：数据同步service实现类
 * 创建人：huangxp
 * 创建时间：2012-7-13
 * 修改备注：
 * @version
 *
 */
public class SjtbServiceImpl extends BaseServiceImpl<YhglModel, ISjtbDao> implements ISjtbService {

    @Override
    public void tbsj(Map map) {
        dao.sjtb(map);
    }



}
