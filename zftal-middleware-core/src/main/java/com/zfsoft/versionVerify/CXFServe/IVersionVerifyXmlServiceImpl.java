
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.versionVerify.CXFServe;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-16T11:51:36.906+08:00
 * Generated source version: 2.6.0
 *
 */

@javax.jws.WebService(
                      serviceName = "VersionVerifyXmlServiceService",
                      portName = "VersionVerifyXmlServicePort",
                      targetNamespace = "http://imp.service.version.webservice.general.zfsoft.com/",
                      wsdlLocation = "http://localhost:8888/zfmobile_versionMB/webservice/version/VersionVerifyXmlService?wsdl",
                      endpointInterface = "com.versionVerify.CXFServe.IVersionVerifyXmlService")

public class IVersionVerifyXmlServiceImpl implements IVersionVerifyXmlService {

    private static final Logger LOG = Logger.getLogger(IVersionVerifyXmlServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.general.webservice.version.service.IVersionVerifyXmlService#versionCompare(java.lang.String  imei ,)java.lang.String  imsi ,)java.lang.String  sysinfo ,)java.lang.String  ua ,)java.lang.String  phonum ,)java.lang.String  account ,)java.lang.String  v )*
     */
    public java.lang.String versionCompare(java.lang.String imei,java.lang.String imsi,java.lang.String sysinfo,java.lang.String ua,java.lang.String phonum,java.lang.String account,java.lang.String v) {
        LOG.info("Executing operation versionCompare");
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

}
