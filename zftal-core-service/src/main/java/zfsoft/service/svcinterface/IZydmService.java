package zfsoft.service.svcinterface;

import zfsoft.dao.entities.ZydmModel;

import java.util.List;
import java.util.Map;


public interface IZydmService {
	/**
	 *
	* 方法描述: 根据部门代码,查询专业列表
	* 参数 @return 参数说明
	* 返回类型  List<BmdmModel>  返回类型
	*/
	public List<ZydmModel> queryModel(Map<String, String> map) ;
}
