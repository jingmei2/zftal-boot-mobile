package zfsoft.service.impl;

import common.service.BaseServiceImpl;
import zfsoft.dao.daointerface.ISjfwzDao;
import zfsoft.dao.entities.SjfwzModel;
import zfsoft.service.svcinterface.ISjfwzService;

import java.util.List;
import java.util.Map;


/**
 *
 * 类名称： SjfwzServiceImpl
 * 类描述：数据范围组Service
 * 创建人：caozf
 * 创建时间：2012-7-12
 */
public class SjfwzServiceImpl extends BaseServiceImpl<SjfwzModel, ISjfwzDao>
		implements ISjfwzService {

	@Override
	public List<SjfwzModel> cxSjfwzYhjs(Map<String, Object> maps)
			{
		return dao.cxSjfwzYhjs(maps);
	}


}
