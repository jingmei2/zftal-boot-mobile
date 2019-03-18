package zfsoft.dao.daointerface;

import zfsoft.dao.entities.YhglModel;
import zfsoft.dao.query.BaseDao;

import java.util.Map;


/**
 *
 *
 * 类名称：ISjtbDao
 * 类描述：数据同步dao接口
 * 创建人：huangxp
 * 创建时间：2012-7-13
 * 修改人：huangxp
 * 修改时间：2012-7-13
 * 修改备注：
 * @version
 *
 */
public interface ISjtbDao extends BaseDao<YhglModel>, common.dao.BaseDao<YhglModel> {
    /**
     * 数据同步用户表
     * @param yhglModel
     * @author HuangXiaoping created on 2012-7-16
     * @since ZFTAL 1.0
     */
    void sjtb(Map map);

}
