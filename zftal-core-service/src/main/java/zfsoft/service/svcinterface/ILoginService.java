package zfsoft.service.svcinterface;

import common.log.User;
import common.service.BaseService;
import zfsoft.dao.entities.LoginModel;
import zfsoft.dao.entities.LoginRecordModel;
import zfsoft.dao.entities.YhglModel;
import zfsoft.dao.entities.userStatictisEntity;
import zfsoft.dao.page.PageList;
import zfsoft.dao.query.LoginRecordModelQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;


/**
 * 该类覆盖了zftal-service中的com.zfsoft.service.svcinterface.ILoginService类增加了单点登录的方法
 *
 * 类名称：LoginService
 * 类描述：登录业务层接口
 * 创建人：hhy
 * 创建时间：2011-12-20 上午10:52:26
 * 修改人：hhy
 * 修改时间：2011-12-20 上午10:52:26
 * 修改备注：
 * @version
 *
 */
public interface ILoginService extends BaseService<LoginModel> {

	//app端进入app引导页调用此接口做安装统计
	public void installsCount();

	//用户秘钥更新
	public void updateStrKey(YhglModel yhglModel);

	//根据用户名获取秘钥
	public String getStrKeyByYhm(String zgh);


	//获取用户秘钥
	public String getStrKey(String apptoken);

	//验证用户登录返回提示信息
	public common.log.User cxYhxx(LoginModel model) ;

	/**
	 * 验证用户单点登录，该方法不做密码验证
	 * @param model
	 * @return
	 */
	public User cxYhxxSso(LoginModel model, HttpSession session);


	//查询用户功能模块代码
	public List<HashMap<String, String>> queryYjGnmkdm(LoginModel model);


	//查询用户二级，三级功能菜单列表
	List<HashMap<String, Object>> queryLeftMenu(LoginModel model);


	//将用户权限经过处理再塞入session
	public void setYhqxToSession(LoginModel model, HttpSession session) ;

	//根据时间查询用户安装量
	public List<userStatictisEntity> getInstallsStatistic(userStatictisEntity entity);

	/**
	 * 根据用户名查询用户信息
	 * @return
	 */
	public common.log.User getInfoByZgh(LoginModel model);

    public int addLoginRecord(Map<String, Object> params);

	public int updateLoginRecord(Map<String, Object> params);

	public int selectLoginRecordByUsername(Map<String, Object> params);

    public PageList<LoginRecordModel> getLoginRecordList(LoginRecordModelQuery loginRecordModel);

	public int getLoginRecordListCount(LoginRecordModelQuery loginRecordModel);

	public int deleteLoginRecord(LoginRecordModelQuery loginRecordModel);

	public int bindDevice(User user);

	//绑定时查询该手机是否绑定过其他账号
	public int countUserByDeviceid(String yhm, String deviceId);

	public YhglModel getUserByDeviceid(String deviceId);

	public List<YhglModel> getUserByDeviceidAndRylx(String deviceId, String lx);

}
