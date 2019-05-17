package com.zfsoft.xg.xg.CXFService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-10-30T10:05:24.203+08:00
 * Generated source version: 2.6.0
 *
 */
@WebService(targetNamespace = "http://service.xg.xgws.zfsoft.com/", name = "IxgService")
@XmlSeeAlso({ObjectFactory.class})
public interface IxgService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getZcfsxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZcfsxx")
    @WebMethod
    @ResponseWrapper(localName = "getZcfsxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZcfsxxResponse")
    public java.lang.String getZcfsxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getFileList", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetFileList")
    @WebMethod
    @ResponseWrapper(localName = "getFileListResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetFileListResponse")
    public java.lang.String getFileList(
        @WebParam(name = "yhlx", targetNamespace = "")
        java.lang.String yhlx,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getZxsxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZxsxx")
    @WebMethod
    @ResponseWrapper(localName = "getZxsxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZxsxxResponse")
    public java.lang.String getZxsxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "xm", targetNamespace = "")
        java.lang.String xm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPjpyXx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetPjpyXx")
    @WebMethod
    @ResponseWrapper(localName = "getPjpyXxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetPjpyXxResponse")
    public java.lang.String getPjpyXx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getDbCount", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDbCount")
    @WebMethod
    @ResponseWrapper(localName = "getDbCountResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDbCountResponse")
    public java.lang.String getDbCount(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getLastNoticeList", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetLastNoticeList")
    @WebMethod
    @ResponseWrapper(localName = "getLastNoticeListResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetLastNoticeListResponse")
    public java.lang.String getLastNoticeList(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "yhlx", targetNamespace = "")
        java.lang.String yhlx,
        @WebParam(name = "type", targetNamespace = "")
        java.lang.String type,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign,
        @WebParam(name = "pageIndex", targetNamespace = "")
        java.lang.Integer pageIndex
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getDjkscjList", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDjkscjList")
    @WebMethod
    @ResponseWrapper(localName = "getDjkscjListResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDjkscjListResponse")
    public java.lang.String getDjkscjList(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getDbList", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDbList")
    @WebMethod
    @ResponseWrapper(localName = "getDbListResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetDbListResponse")
    public java.lang.String getDbList(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getWjcfxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetWjcfxx")
    @WebMethod
    @ResponseWrapper(localName = "getWjcfxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetWjcfxxResponse")
    public java.lang.String getWjcfxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTzggDetail", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetTzggDetail")
    @WebMethod
    @ResponseWrapper(localName = "getTzggDetailResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetTzggDetailResponse")
    public java.lang.String getTzggDetail(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getQjxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetQjxx")
    @WebMethod
    @ResponseWrapper(localName = "getQjxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetQjxxResponse")
    public java.lang.String getQjxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getZpxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZpxx")
    @WebMethod
    @ResponseWrapper(localName = "getZpxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZpxxResponse")
    public java.lang.String getZpxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCjffxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetCjffxx")
    @WebMethod
    @ResponseWrapper(localName = "getCjffxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetCjffxxResponse")
    public java.lang.String getCjffxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getKscjList", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetKscjList")
    @WebMethod
    @ResponseWrapper(localName = "getKscjListResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetKscjListResponse")
    public java.lang.String getKscjList(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getZzxmxx", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZzxmxx")
    @WebMethod
    @ResponseWrapper(localName = "getZzxmxxResponse", targetNamespace = "http://service.xg.xgws.zfsoft.com/", className = "com.xg.xg.CXFService.GetZzxmxxResponse")
    public java.lang.String getZzxmxx(
        @WebParam(name = "yhm", targetNamespace = "")
        java.lang.String yhm,
        @WebParam(name = "num", targetNamespace = "")
        java.lang.Integer num,
        @WebParam(name = "PAGE", targetNamespace = "")
        java.lang.String page,
        @WebParam(name = "sign", targetNamespace = "")
        java.lang.String sign
    );


}