
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.backMh.recommend.CXFService.service;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-31T16:38:25.656+08:00
 * Generated source version: 2.6.0
 *
 */

@javax.jws.WebService(
                      serviceName = "RecommendXmlServiceService",
                      portName = "RecommendXmlServicePort",
                      targetNamespace = "http://impl.service.mhrecommend.logic.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://10.71.32.205:8888/zfmcmh/webservices/mhrecommend/RecommendXmlService?wsdl",
                      endpointInterface = "com.backMh.recommend.CXFService.service.IRecommendXmlService")

public class IRecommendXmlServiceImpl implements IRecommendXmlService {

    private static final Logger LOG = Logger.getLogger(IRecommendXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.logic.mhrecommend.service.IRecommendXmlService#getRecommendInfo(java.lang.String  id )*
     */
    public java.lang.String getRecommendInfo(java.lang.String id) {
        LOG.info("Executing operation getRecommendInfo");
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
     * @see com.zfsoft.general.webservice.logic.mhrecommend.service.IRecommendXmlService#getMhRecommendList(int  start ,)int  size )*
     */
    public java.lang.String getMhRecommendList(int start,int size) {
        LOG.info("Executing operation getMhRecommendList");
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
     * @see com.zfsoft.general.webservice.logic.mhrecommend.service.IRecommendXmlService#getMhRecommendPage(int  start ,)int  size )*
     */
    public java.lang.String getMhRecommendPage(int start,int size) {
        LOG.info("Executing operation getMhRecommendPage");
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
