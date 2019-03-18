package zfsoft.service.svcinterface;

import common.service.BaseService;
import zfsoft.dao.entities.GnmkModel;

import java.util.List;



/**
 *
 *
 * 类名称：
 * 类描述：
 * 创建人：huangxp
 * 创建时间：2012-6-28
 * 修改人：huangxp
 * 修改时间：2012-6-28
 * 修改备注：
 * @version
 *
 */
public interface IGnmkService extends BaseService<GnmkModel> {
    public List<GnmkModel> cxCzdm(GnmkModel model);
}
