package zfsoft.service.svcinterface;

import common.service.BaseService;
import zfsoft.dao.entities.SjfwzModel;

import java.util.List;
import java.util.Map;


/**
 *
 * 类名称： ISjfwzService
 * 类描述：数据范围组Service
 * 创建人：caozf
 * 创建时间：2012-7-12
 */
public interface ISjfwzService extends BaseService<SjfwzModel> {

	/**
	 * 根据用户角色查询数据范围组
	 * @param t
	 * @return
	 * @
	 */
	public List<SjfwzModel> cxSjfwzYhjs(Map<String, Object> maps) ;
}
