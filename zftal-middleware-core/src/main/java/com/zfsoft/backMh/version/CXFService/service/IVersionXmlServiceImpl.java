
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.backMh.version.CXFService.service;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T11:28:22.296+08:00
 * Generated source version: 2.5.2
 *
 */

@javax.jws.WebService(
                      serviceName = "VersionXmlServiceService",
                      portName = "VersionXmlServicePort",
                      targetNamespace = "http://service.version.sys.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/version/VersionXmlService?wsdl",
                      endpointInterface = "com.backMh.version.CXFService.service.IVersionXmlService")

public class IVersionXmlServiceImpl implements IVersionXmlService {

    private static final Logger LOG = Logger.getLogger(IVersionXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.sys.version.service.IVersionXmlService#decode(java.lang.String  code )*
     */
    public java.lang.String decode(java.lang.String code) {
        LOG.info("Executing operation decode");
        System.out.println(code);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.sys.version.service.IVersionXmlService#checkVersion(java.lang.String  imei ,)java.lang.String  imsi ,)java.lang.String  sysinfo ,)java.lang.String  ua ,)java.lang.String  phonum ,)java.lang.String  account ,)java.lang.String  v )*
     */
    public java.lang.String checkVersion(java.lang.String imei,java.lang.String imsi,java.lang.String sysinfo,java.lang.String ua,java.lang.String phonum,java.lang.String account,java.lang.String v) {
        LOG.info("Executing operation checkVersion");
        System.out.println(imei);
        System.out.println(imsi);
        System.out.println(sysinfo);
        System.out.println(ua);
        System.out.println(phonum);
        System.out.println(account);
        System.out.println(v);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.sys.version.service.IVersionXmlService#encode(java.lang.String  code )*
     */
    public java.lang.String encode(java.lang.String code) {
        LOG.info("Executing operation encode");
        System.out.println(code);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
