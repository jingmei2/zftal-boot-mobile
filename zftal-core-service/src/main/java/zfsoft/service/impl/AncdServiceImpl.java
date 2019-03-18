package zfsoft.service.impl;

import common.log.User;
import zfsoft.dao.daointerface.IAncdDao;
import zfsoft.dao.entities.AncdModel;
import zfsoft.service.svcinterface.IAncdService;

import java.util.List;


/**
 *
*
* 类名称：JcsjServiceImpl
* 类描述： 按钮菜单业务处理实现类
* 创建人：yijd
* 创建时间：2012-4-25 上午10:22:13
* 修改人：yijd
* 修改时间：2012-4-25 上午10:22:13
* 修改备注：
* @version
*
 */
public class AncdServiceImpl implements IAncdService {
	private IAncdDao ancdDao;

	public IAncdDao getAncdDao() {
		return ancdDao;
	}

	public void setAncdDao(IAncdDao ancdDao) {
		this.ancdDao = ancdDao;
	}

	public List<AncdModel> cxAncd(AncdModel ancdModel, User user){
		List<AncdModel> list=null;
		if(user!=null && "student".equals(user.getYhlx())){
			list=this.ancdDao.cxAncdXs(ancdModel);
		}else{
			list=this.ancdDao.cxAncdLs(ancdModel);
		}
		return list;
	}

	public List<AncdModel> cxAncd(User user, String path)
			{
		AncdModel ancdModel=new AncdModel();
		if(user!=null){
			ancdModel.setDyym(path);
			ancdModel.setYhm(user.getYhm());
			if(user.getJsdms()!=null&&user.getJsdms().size()==1){
				ancdModel.setJsdm(user.getJsdms().get(0));
			}
		}
		List<AncdModel> list=null;
		if(user!=null && "student".equals(user.getYhlx())){
			list=this.ancdDao.cxAncdXs(ancdModel);
		}else{
			list=this.ancdDao.cxAncdLs(ancdModel);
		}
		return list;
	}

}
