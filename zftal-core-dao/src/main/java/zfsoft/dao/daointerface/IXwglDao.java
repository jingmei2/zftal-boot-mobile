package zfsoft.dao.daointerface;


import zfsoft.dao.entities.XwglModel;
import zfsoft.dao.query.BaseDao;

/**
 *
*
* 类名称：XwglDao
* 类描述： 新闻管理
* 创建人：qph
* 创建时间：2012-4-20
* 修改备注：
*
 */
public interface IXwglDao extends BaseDao<XwglModel> {

	public void getList();
}
