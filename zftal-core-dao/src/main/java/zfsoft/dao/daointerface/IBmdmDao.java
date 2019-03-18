package zfsoft.dao.daointerface;

import zfsoft.dao.entities.BmdmModel;
import zfsoft.dao.query.BaseDao;

import java.util.List;
import java.util.Map;


/**
 * 类描述：部门管理
 * 创建人：caozf
 * 创建时间：2012-6-11
 * @version
 */
public interface IBmdmDao extends common.dao.BaseDao<BmdmModel> {
	/**
	 *
	* 方法描述: 查询部门列表
	* 参数 @return 参数说明
	* 返回类型  List<BmdmModel>  返回类型
	*/
	public List<BmdmModel> queryModel(Map<String, String> map);

}
