package zfsoft.service.impl;


import common.service.BaseServiceImpl;
import zfsoft.dao.daointerface.ISjfwdxDao;
import zfsoft.dao.entities.SjfwdxModel;
import zfsoft.service.svcinterface.ISjfwdxService;

import java.util.List;

/**
 *
 * 类名称： SjfwdxServiceImpl
 * 类描述：数据范围对象Service
 * 创建人：caozf
 * 创建时间：2012-7-12
 */
public class SjfwdxServiceImpl extends BaseServiceImpl<SjfwdxModel, ISjfwdxDao>
		implements ISjfwdxService {

	@Override
	public List<SjfwdxModel> cxSjfwdx() {
		return dao.cxSjfwdx();
	}

	@Override
	public List<SjfwdxModel> cxSjfwnr(SjfwdxModel model) {
		return dao.cxSjfwnr(model);
	}
}
