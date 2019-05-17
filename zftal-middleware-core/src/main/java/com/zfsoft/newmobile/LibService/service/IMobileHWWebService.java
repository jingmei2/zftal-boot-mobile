package com.zfsoft.newmobile.LibService.service;

import java.io.InputStream;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;




@WebService
public interface IMobileHWWebService {

	public String getreader(@WebParam(name="userName")String userName,@WebParam(name="apptoken")String apptoken);


	public String getBook(@WebParam(name="userName")String userName,@WebParam(name="apptoken")String apptoken,
			@WebParam(name="type")String type,@WebParam(name="value")String value);

	public String getCircs(@WebParam(name="userName")String userName,  @WebParam(name="certId")String certId
			,@WebParam(name="apptoken")String apptoken);


	public String getDebts(@WebParam(name="userName")String userName, @WebParam(name="certId")String certId
			,@WebParam(name="apptoken")String apptoken);

	public String getPregArrivals(@WebParam(name="userName")String userName, @WebParam(name="certId")String certId
			,@WebParam(name="apptoken")String apptoken);
}
