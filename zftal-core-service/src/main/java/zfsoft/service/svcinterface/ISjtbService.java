package zfsoft.service.svcinterface;

import common.service.BaseService;
import zfsoft.dao.entities.YhglModel;

import java.util.Map;



/**
 *
 *
 * 类名称：ISjtbService
 * 类描述：数据同步service
 * 创建人：huangxp
 * 创建时间：2012-7-13
 * 修改人：huangxp
 * 修改时间：2012-7-13
 * 修改备注：
 * @version
 *
 */
public interface ISjtbService extends BaseService<YhglModel> {

    /**
     *
     * @param yhglModel
     * @return
     * @author Huangxp created on 2012-7-13
     * @since ZFTAL 1.0
     */
     void tbsj(Map map);
}
