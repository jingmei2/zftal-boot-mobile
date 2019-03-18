package zfsoft.dao.daointerface;


import zfsoft.dao.entities.SjfwdxModel;
import zfsoft.dao.query.BaseDao;

import java.util.List;

/**
 *
 * 类名称：ISjfwdxDao
 * 类描述：用户数据范围Dao
 * 创建人：caozf
 * 创建时间：2012-7-10
 */
public interface ISjfwdxDao extends BaseDao<SjfwdxModel>, common.dao.BaseDao<SjfwdxModel> {

	/**
	 * 查询数据范围对象列表
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public List<SjfwdxModel> cxSjfwdx();

	/**
	 * 根据数据范围对象，查询数据范围内容
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public List<SjfwdxModel> cxSjfwnr(SjfwdxModel model);

}
