package com.zfsoft.backMh.introduce.CXFServe.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-05T14:44:16.250+08:00
 * Generated source version: 2.5.2
 *
 */
@WebService(targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", name = "IIntroduceXmlService")
@XmlSeeAlso({ObjectFactory.class})
public interface IIntroduceXmlService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getChildIntroduceTypeList", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetChildIntroduceTypeList")
    @WebMethod
    @ResponseWrapper(localName = "getChildIntroduceTypeListResponse", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetChildIntroduceTypeListResponse")
    public java.lang.String getChildIntroduceTypeList(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getRootIntroduceTypeList", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetRootIntroduceTypeList")
    @WebMethod
    @ResponseWrapper(localName = "getRootIntroduceTypeListResponse", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetRootIntroduceTypeListResponse")
    public java.lang.String getRootIntroduceTypeList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getIntroduceByTypeId", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetIntroduceByTypeId")
    @WebMethod
    @ResponseWrapper(localName = "getIntroduceByTypeIdResponse", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetIntroduceByTypeIdResponse")
    public java.lang.String getIntroduceByTypeId(
        @WebParam(name = "tid", targetNamespace = "")
        java.lang.String tid
    );
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getChildIntroduceTypeListAddPid", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetChildIntroduceTypeListAddPid")
    @WebMethod
    @ResponseWrapper(localName = "getChildIntroduceTypeListAddPidResponse", targetNamespace = "http://service.introduce.logic.webservice.general.zfsoft.com/", className = "com.backMh.introduce.CXFServe.service.GetChildIntroduceTypeListAddPidResponse")
    public java.lang.String getChildIntroduceTypeListAddPid(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "start", targetNamespace = "")
        int start,
        @WebParam(name = "size", targetNamespace = "")
        int size
    );

}
