package com.zfsoft.mobile.webservices.service;

import java.io.IOException;

import javax.jws.WebParam;


/**
 * 服务WEB Service 接口
 * @author Administrator
 *
 */
public interface IWSSerService {

	/**
	 * pageIndex
	 * @param textContent 意见反馈内容检索
	 * @param versionNumber 学校app版本号
	 * @param schoolCode 学校编码
	 * @param userName  用户名
	 * @param pageIndex 页码
	 * @param strKey 加密符
	 * @return
	 */
	public String getSchoolSuggestList(
			@WebParam(name="textContent")String textContent,
			@WebParam(name="versionNumber")String versionNumber,
			@WebParam(name="schoolCode")String schoolCode,
			@WebParam(name="userName")String userName,
			@WebParam(name="pageIndex")String pageIndex,
			@WebParam(name="strKey")String strKey
	);

	/**
	 * 获取所有第三方绑定关系
	 * @param userId 用户id
	 * @return
	 */
	public String getThirdPartyList(String userId);

	/**
	 * 第三方登录
	 * @param openId 第三方唯一性标识
	 * @param sign	 后台登录秘钥
	 * @return
	 */
	public String thirdPartyLogin(String openId, String sign);

	/**
	 * 解绑第三方授权登录
	 * @param userId 用户id
	 * @param type   第三方类型，qq为1，微信为2，新浪微3
	 * @return
	 */
	public String deleteThirdParty(String userId,String type);

	/**
	 * 第三方授权
	 * @param userId 用户id
	 * @param openId 第三方唯一性标识
	 * @param type	第三方类型，qq为1，微信为2，新浪微3
	 * @return
	 */
	public String submitThirdParty(String userId,String openId, String type);

	/**
	 * 删除备忘录
	 * @param memoFileNameList  备忘录名称列表,逗号","隔开
	 */
	public String deleteMyMemoList(String memoFileNameList);

	/**
	 * 提交个人备忘录类别
	 * @param userId 用户id
	 * @param memoCatalogNameList 备忘录类别集合
	 * @return
	 */
	public String submitMemoCatalogList(String userId,String memoCatalogNameList, String memoCatalogColorList);

	/**
	 * 获取备忘录类别列表
	 * @param userId 用户id
	 * @return
	 */
	public String getMemoCatalogList(String userId);

	/**
	 * 获取备忘录列表
	 * @param userId
	 * @param start
	 * @param size
	 * @param title
	 * @param memoCatalogName
	 * @return
	 */
	public String getMyMemoList(String userId,int start, int size,String title,String memoCatalogName);

	/**
	 * 获取失物招领列表
	 * @param userid	发布者名称(如果为空则查询所有)
	 * @param title	检索内容(根据主题检索)
	 * @param isover	是否已招领
	 * @param start	开始页码
	 * @param isover 每页多少条
	 * @return
	 */
	public String getLossObjectList(String userid, String title, String isover,int start, int size);

	/**
	 * 发布失物招领
	 * @param pulishuser	发布者id
	 * @param title			失物招领主题
	 * @param place			失物招领放置位置
	 * @param content		详情内容描述
	 * @param flag			是丢失还是捡到 0丢失，1找到
	 * @return
	 */
	public String publishLossObject(String pulishuser, String title,String place,String content,String flag);

	/**
	 * 获取通用服务
	 * @return
	 */
	public String getCommonService();

	/**
	 * 版本更新验证
	 * @param imei
	 * @param imsi
	 * @param sysinfo
	 * @param ua
	 * @param phonum
	 * @param account
	 * @param v
	 * @return
	 */
	public String versionCompare(String imei, String imsi, String sysinfo,
			String ua, String phonum, String account, String v);


	/**
	 * 获取地图数据
	 * @return
	 */
	public String getMapList();

	/**
	 * 提交问卷答案
	 * @param userId
	 * @param xml
	 * @return
	 */
	public String submitExamAnswer(String userId,String xml);
	/**
	 * 获取问卷
	 * @param userId
	 * @param papermainid
	 * @param start
	 * @param size
	 * @return
	 */
	public String getExamList(String userId,int start, int size);
	/**
	 * 提交发布问卷
	 * @param userId
	 * @param xml
	 * @return
	 */
	public String submitExam(String userId,String xml);

	/**
	 * 获取二维码
	 * @return
	 */
	public String getQRcode();

	/**
	 * 获取当前学年月份
	 * @param code
	 * @return
	 */
	//public String getYearWeek(String code);

	/**
	 * 获取当前学期周
	 * @param ymd
	 * @return
	 */
	public String getTermWeek(String ymd);

	/**
	 * 获取通知公告分类表
	 * @return
	 */
	public String getNoticeListNewTableType();

	/**
	 * 获取通知公告列表
	 * @param yhm用户名
	 * @param type通知公告类型
	 * @param start页码
	 * @param size每页size
	 * @return
	 */
	public String getNoticeList(String yhm, String type,String start, String size);

	/**
	 * 获取通知公告详情
	 * @param yhm用户名
	 * @param id通知公告id
	 * @return
	 */
	public String getNoticeInfo(String resource_id);

	/**
	 * 根据服务编码对应用做统计
	 * @param fwbm
	 * @return
	 */
	public String visitsByFwbm(String fwbm);

	/**
	 * 根据服务编码对应用做统计,连接到正方的正式服务器插入操作
	 * @param fwbm
	 * @return
	 */
	public String insertVisitsToZFByFwbm(String fwbm,String schoolCode);

	/**
	 * 根据微博编号获取此微博账号发表过的微博
	 * @param wbbh
	 * @param pageindex
	 * @return
	 */
	public String getUserTimeLine(String wbbh,long pageindex);

	/**
	 * 获取所有微博列表
	 * @return
	 */
	public String getWeiBoList(int pageindex, int size);

	/**
	 * 一卡通余额查询
	 * @param userid 工号
	 * @param strkey 秘钥
	 * @param apptoken 个人密钥
	 * @return
	 */
	String getocbalance(String userid,String strkey);

	/**
	 * 一卡通消费查询
	 * @param detailtype 查询的类型
	 * @param ocid 一卡通卡号
	 * @param startdate 查询时间起始日期
	 * @param enddate 查询时间结束日期
	 * @param pageindex 当前页号
	 * @param pagesize 一页个数
	 * @param strkey 秘钥
	 * @param apptoken 秘钥
	 * @return
	 */
	String getocdetail(String detailtype,String ocid,
		    String startdate,String enddate,String pageindex,
		    String pagesize,String strkey);


	/**
     * 获取推荐的新闻
     * @param size 获取多少个推荐新闻，按时间来排序获取
     * @return
     */
    public String getMhRecommendPage(int size);

	/**
	 * 投票列表获取
	 * @param username
	 * @param tphdid投票活动id
	 * @param strkey
	 * @return
	 */

	public String votelist(String userName ,String tphdid , String strKey);

	/**
	 * 点赞交互
	 * @param username
	 * @param jmid 节目id
	 * @param tag 1表示投票，0表示取消投票
	 * @param strkey
	 * @return
	 */
	public String votelike(String userName ,String jmid ,String tag ,String strKey);

	/**
	 * 节目排名列表
	 * @param username
	 * @param tphdid tphdid投票活动id
	 * @param strkey
	 * @return
	 */
	public String voteRanklist(String userName , String tphdid , String strKey);
	/**
	 * 上传客户端我的门户中头像至服务器存储（换手机时需要重新获取头像）
	 * @param userId
	 * @param fileName
	 * @param content
	 * @return
	 */
	public String uploadMyPicture(String userId,String fileName, byte[] content);

	/**
	 * 获取我的头像路径
	 * @param userId
	 * @return
	 */
	public String getMyPicturePath(String userId);

    /**
     * 根据用户取得该用户的所有服务
     * @param userId
     * @return
     * @throws IOException
     */
    public String CommonAllFunction(String userId,String strKey);

    /**
     * 根据用户取得该用户没有添加的所有服务
     * @param userId
     * @return
     * @throws IOException
     */
    public String CommonOtherFunction(String userId,String strKey);

    /**
     * 根据用户、业务ID取得该用户的所有服务
     * @param userId
     * @param ywId
     * @return
     * @throws IOException
     */
    public String CommonBrushFunction(String userId,String ywId,String strKey);

    /**
     * 取得用户的所有业务系统
     * @param userId
     * @return
     */
    public String getAllXtYwByUser(String userId);

    /**
     * 根据用户取得该用户的常用服务
     * @throws IOException
     */
    public String Commonfunction(String userId,String strKey);

    /**
     * 添加常用服务
     * @param userId
     * @param fwBm
     * @param isadd
     */
    public String SubmitCommonFunction(String userId, String fwBm, boolean isadd);

    /**
     * 删除常用服务
     * @param userId
     * @param fwBm
     * @return
     */
    public String deleteFrequentlyService(String userId, String strKey, String fwBm);

    public String insertFrequentlyService(String userId, String strKey, String fwBm, boolean isadd);

    /**
     * 更新常用服务
     * @param userId
     * @param fwBm
     * @param type 0-更新使用次数,1-更新热度 向下,2-更新热度 向上,3-更新热度 拖拽
     * @param toMark 拖拽的位置
     */
    public void modifyFrequentlyService(String userId, String fwBm, String type, int toMark);

   /**
    * 取得资讯类别
    * @param userId
    * @param strKey
    * @return
    */
    public String getNewsTab(String userId, String strKey);

    /**
     * 根据资讯类别取得推荐资讯
     * @throws IOException
     */
    //spublic String getMhRecommendPage(String categoryId, int start, int size);

    /**
     * 根据资讯类别取得资讯（除推荐资讯）
     * @throws IOException
     */
    public String getNewsByCategory(String categoryId);

    /**
     * 获取APP菜单
     * @return
     * @throws IOException
     */
    public String getMobileAppType();

    /**
     * 根据资讯类别获取资讯
     * @param type 资讯类别，当类别为空时取头条数据
     * @param start 从第几页开始
     * @param size 每页显示多少条
     * @return
     * @throws IOException
     */
    public String getNewsList(String type, int start, int size) throws IOException;

    /**
     * 调用接口
     * @param accessKey 授权密钥
     * @param credential 身份凭证
     * @param code 接口编码
     * @return
     */
    public String callInterface(String userName, String code, String sign);

    public String login(String userName, String password, String sign);

    public String sign(String code);

    public String getTicket(String userName, String password, String xtdms, String remoteUrl, String sign);

    /**
     * 我的门户接口
     * @param userName 用户ID
     * @param strKey
     * @return
     */
    public String myPortalFunction(String userName, String strKey);

    /**
     * 获取我的门户图书馆未归还图书数，一卡通余额，工资信息
     * @param userId
     * @param strKey
     * @return
     */
    public String getPortalInfo(String userId, String strKey);

    /**
     * 客户端提出的建议储存到数据库
     * @param userName
     * @param suggestion
     * @param strKey
     * @return
     */
    public String submitSuggestion(String userName,String suggestion, String strKey);

    /**
     * 数字档案部门选择
     * @param userName
     * @param strKey
     * @return
     */
    public String digitalArchivesDpList(String userName, String strKey);

    /**
     * 数字档案部门人员列表
     * @param userName
     * @param dpId
     * @param strKey
     * @param searchName
     * @param start
     * @param size
     * @return
     */
    public String digitalArchivesPersonnelList(String userName, String dpId,String strKey,String searchName, int start, int size );
    /**
     * 数字档案部门人员列表
     * @param userName
     * @param dpId
     * @param strKey
     * @return
     */
    //public String digitalArchivesPersonnelList(String userName, String dpId,String strKey);

    /**
     * 数字档案个人详情信息类别
     * @param userName
     * @param strKey
     * @return
     */
    public String personDocumentInformationList(String userName,String strKey);

    /**
     * 根据类别显示数字档案下信息类的具体记录信息
     * @param userName
     * @param informationId
     * @param strKey
     * @return
     */
    public String personDocumentInformation(String userName, String informationName,String informationId,String strKey);

	String getMhRecommendPage(String categoryId, int start, int size);

	String getXfyjList();

	String getXfyjDetails(String id,String userName,String start,String size);

	//------------食堂订餐接口开始-------------------
	String getCanteenList(String canteenname,String startStr,String sizeStr);

	String getCanteenDetailList(String canteenId);

	String placeOrder(String data);

	String getOrderlistByUser(String username,String startStr,String sizeStr);

	String findOrderDetail(String username,String orderId);

	String getAddressListByUser(String username,String start,String size);

	String submitAddressForUser(String addressId,String userId,String name,String mobilePhone,String schoolName,String specificAddress);

	String deleteAddressByUser(String addressId);
	//------------食堂订餐接口结束-------------------
}
