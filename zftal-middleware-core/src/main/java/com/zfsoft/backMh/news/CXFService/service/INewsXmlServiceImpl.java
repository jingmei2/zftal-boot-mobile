
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.backMh.news.CXFService.service;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T09:49:02.156+08:00
 * Generated source version: 2.5.2
 *
 */

@javax.jws.WebService(
                      serviceName = "NewsXmlServiceService",
                      portName = "NewsXmlServicePort",
                      targetNamespace = "http://service.news.logic.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/news/NewsXmlService?wsdl",
                      endpointInterface = "com.backMh.news.CXFService.service.INewsXmlService")

public class INewsXmlServiceImpl implements INewsXmlService {

    private static final Logger LOG = Logger.getLogger(INewsXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getNewsInfo(java.lang.String  id )*
     */
    public java.lang.String getNewsInfo(java.lang.String id) {
        LOG.info("Executing operation getNewsInfo");
        System.out.println(id);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getAllNewsTypeList(*
     */
    public java.lang.String getAllNewsTypeList() {
        LOG.info("Executing operation getAllNewsTypeList");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getTypeNewsPageList(java.lang.String  newtype ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeNewsPageList(java.lang.String newtype,int start,int size) {
        LOG.info("Executing operation getTypeNewsPageList");
        System.out.println(newtype);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getTypeIdNewsPageList(java.lang.String  tid ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeIdNewsPageList(java.lang.String tid,int start,int size) {
        LOG.info("Executing operation getTypeIdNewsPageList");
        System.out.println(tid);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getIndexNewsList(int  start ,)int  size )*
     */
    public java.lang.String getIndexNewsList(int start,int size) {
        LOG.info("Executing operation getIndexNewsList");
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getTypeNewsPageListNew(java.lang.String  newtype ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeNewsPageListNew(java.lang.String newtype,int start,int size) {
        LOG.info("Executing operation getTypeNewsPageListNew");
        System.out.println(newtype);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getIndexNewsListNew(int  start ,)int  size )*
     */
    public java.lang.String getIndexNewsListNew(int start,int size) {
        LOG.info("Executing operation getIndexNewsListNew");
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.news.service.INewsXmlService#getTypeIdNewsPageListNew(java.lang.String  tid ,)int  start ,)int  size )*
     */
    public java.lang.String getTypeIdNewsPageListNew(java.lang.String tid,int start,int size) {
        LOG.info("Executing operation getTypeIdNewsPageListNew");
        System.out.println(tid);
        System.out.println(start);
        System.out.println(size);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
