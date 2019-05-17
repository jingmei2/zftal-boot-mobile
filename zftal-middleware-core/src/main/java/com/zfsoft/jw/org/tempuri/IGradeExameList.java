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
 * 2015-08-07T16:52:16.712+08:00
 * Generated source version: 2.6.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IGradeExameList")
@XmlSeeAlso({ObjectFactory.class})
public interface IGradeExameList {

    @WebResult(name = "SubGradeExameInfoResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IGradeExameList/SubGradeExameInfo", output = "http://tempuri.org/IGradeExameList/SubGradeExameInfoResponse")
    @RequestWrapper(localName = "SubGradeExameInfo", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.SubGradeExameInfo")
    @WebMethod(operationName = "SubGradeExameInfo", action = "http://tempuri.org/IGradeExameList/SubGradeExameInfo")
    @ResponseWrapper(localName = "SubGradeExameInfoResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.SubGradeExameInfoResponse")
    public java.lang.String subGradeExameInfo(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "GradeExamArrangeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IGradeExameList/GradeExamArrange", output = "http://tempuri.org/IGradeExameList/GradeExamArrangeResponse")
    @RequestWrapper(localName = "GradeExamArrange", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeExamArrange")
    @WebMethod(operationName = "GradeExamArrange", action = "http://tempuri.org/IGradeExameList/GradeExamArrange")
    @ResponseWrapper(localName = "GradeExamArrangeResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeExamArrangeResponse")
    public java.lang.String gradeExamArrange(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "GradeExamArrangeIntroduceResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IGradeExameList/GradeExamArrangeIntroduce", output = "http://tempuri.org/IGradeExameList/GradeExamArrangeIntroduceResponse")
    @RequestWrapper(localName = "GradeExamArrangeIntroduce", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeExamArrangeIntroduce")
    @WebMethod(operationName = "GradeExamArrangeIntroduce", action = "http://tempuri.org/IGradeExameList/GradeExamArrangeIntroduce")
    @ResponseWrapper(localName = "GradeExamArrangeIntroduceResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeExamArrangeIntroduceResponse")
    public java.lang.String gradeExamArrangeIntroduce(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "GradeHasExamArrangeIntroduceResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IGradeExameList/GradeHasExamArrangeIntroduce", output = "http://tempuri.org/IGradeExameList/GradeHasExamArrangeIntroduceResponse")
    @RequestWrapper(localName = "GradeHasExamArrangeIntroduce", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeHasExamArrangeIntroduce")
    @WebMethod(operationName = "GradeHasExamArrangeIntroduce", action = "http://tempuri.org/IGradeExameList/GradeHasExamArrangeIntroduce")
    @ResponseWrapper(localName = "GradeHasExamArrangeIntroduceResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeHasExamArrangeIntroduceResponse")
    public java.lang.String gradeHasExamArrangeIntroduce(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );

    @WebResult(name = "GradeHasExamArrangeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IGradeExameList/GradeHasExamArrange", output = "http://tempuri.org/IGradeExameList/GradeHasExamArrangeResponse")
    @RequestWrapper(localName = "GradeHasExamArrange", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeHasExamArrange")
    @WebMethod(operationName = "GradeHasExamArrange", action = "http://tempuri.org/IGradeExameList/GradeHasExamArrange")
    @ResponseWrapper(localName = "GradeHasExamArrangeResponse", targetNamespace = "http://tempuri.org/", className = "com.jw.org.tempuri.GradeHasExamArrangeResponse")
    public java.lang.String gradeHasExamArrange(
        @WebParam(name = "parameterList", targetNamespace = "http://tempuri.org/")
        java.lang.String parameterList,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count,
        @WebParam(name = "strKey", targetNamespace = "http://tempuri.org/")
        java.lang.String strKey
    );
}