
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.backMh.notice.CXFService.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T10:15:37.031+08:00
 * Generated source version: 2.5.2
 *
 */

@javax.jws.WebService(
                      serviceName = "NoticeXmlServiceService",
                      portName = "NoticeXmlServicePort",
                      targetNamespace = "http://service.notice.sys.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/notice/NoticeXmlService?wsdl",
                      endpointInterface = "com.zfsoft.general.webservice.sys.notice.service.INoticeXmlService")

public class INoticeXmlServiceImpl implements INoticeXmlService {

    private static final Logger LOG = Logger.getLogger(INoticeXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.sys.notice.service.INoticeXmlService#getIndexNoticeListXml(int  topCount )*
     */
    public java.lang.String getIndexNoticeListXml(int topCount) {
        LOG.info("Executing operation getIndexNoticeListXml");
        System.out.println(topCount);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.sys.notice.service.INoticeXmlService#getNoticeInfo(java.lang.String  id )*
     */
    public java.lang.String getNoticeInfo(java.lang.String id) {
        LOG.info("Executing operation getNoticeInfo");
        System.out.println(id);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
