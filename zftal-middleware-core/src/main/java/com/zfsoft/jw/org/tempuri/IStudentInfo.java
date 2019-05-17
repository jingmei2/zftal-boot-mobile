package com.zfsoft.jw.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-08-07T16:52:16.759+08:00
 * Generated source version: 2.6.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IStudentInfo")
@XmlSeeAlso({ObjectFactory.class})
public interface IStudentInfo {

    @WebResult(name = "StudentPhotosSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IStudentInfo/StudentPhotosSearch", output = "http://tempuri.org/IStudentInfo/StudentPhotosSearchResponse")
    @RequestWrapper(localName = "StudentPhotosSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentPhotosSearch")
    @WebMethod(operationName = "StudentPhotosSearch", action = "http://tempuri.org/IStudentInfo/StudentPhotosSearch")
    @ResponseWrapper(localName = "StudentPhotosSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentPhotosSearchResponse")
    public byte[] studentPhotosSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "StudentInfoSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IStudentInfo/StudentInfoSearch", output = "http://tempuri.org/IStudentInfo/StudentInfoSearchResponse")
    @RequestWrapper(localName = "StudentInfoSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentInfoSearch")
    @WebMethod(operationName = "StudentInfoSearch", action = "http://tempuri.org/IStudentInfo/StudentInfoSearch")
    @ResponseWrapper(localName = "StudentInfoSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentInfoSearchResponse")
    public java.lang.String studentInfoSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "StudentRewardSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IStudentInfo/StudentRewardSearch", output = "http://tempuri.org/IStudentInfo/StudentRewardSearchResponse")
    @RequestWrapper(localName = "StudentRewardSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentRewardSearch")
    @WebMethod(operationName = "StudentRewardSearch", action = "http://tempuri.org/IStudentInfo/StudentRewardSearch")
    @ResponseWrapper(localName = "StudentRewardSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentRewardSearchResponse")
    public java.lang.String studentRewardSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "StudentChangedSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IStudentInfo/StudentChangedSearch", output = "http://tempuri.org/IStudentInfo/StudentChangedSearchResponse")
    @RequestWrapper(localName = "StudentChangedSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentChangedSearch")
    @WebMethod(operationName = "StudentChangedSearch", action = "http://tempuri.org/IStudentInfo/StudentChangedSearch")
    @ResponseWrapper(localName = "StudentChangedSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentChangedSearchResponse")
    public java.lang.String studentChangedSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "StudentPunishmentSearchResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IStudentInfo/StudentPunishmentSearch", output = "http://tempuri.org/IStudentInfo/StudentPunishmentSearchResponse")
    @RequestWrapper(localName = "StudentPunishmentSearch", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentPunishmentSearch")
    @WebMethod(operationName = "StudentPunishmentSearch", action = "http://tempuri.org/IStudentInfo/StudentPunishmentSearch")
    @ResponseWrapper(localName = "StudentPunishmentSearchResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.StudentPunishmentSearchResponse")
    public java.lang.String studentPunishmentSearch(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );
}
