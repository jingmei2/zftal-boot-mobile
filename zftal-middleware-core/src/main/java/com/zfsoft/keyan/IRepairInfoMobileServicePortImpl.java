
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zfsoft.keyan;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-31T15:38:13.534+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      serviceName = "IRepairInfoMobileServiceService",
                      portName = "IRepairInfoMobileServicePort",
                      targetNamespace = "http://service.hq.portal.webservice.zfsoft.com/",
                      wsdlLocation = "http://10.71.33.70:8089/zfwebservice/repairInfoMobileService?wsdl",
                      endpointInterface = "com.keyan.IRepairInfoMobileService")

public class IRepairInfoMobileServicePortImpl implements IRepairInfoMobileService {

    private static final Logger LOG = Logger.getLogger(IRepairInfoMobileServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zfsoft.keyan.IRepairInfoMobileService#submitRepair(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8)*
     */
    public java.lang.String submitRepair(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) {
        LOG.info("Executing operation submitRepair");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
        System.out.println(arg4);
        System.out.println(arg5);
        System.out.println(arg6);
        System.out.println(arg7);
        System.out.println(arg8);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.keyan.IRepairInfoMobileService#getMobieRepairList(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)*
     */
    public java.lang.String getMobieRepairList(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        LOG.info("Executing operation getMobieRepairList");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.keyan.IRepairInfoMobileService#getMobieRepairType(java.lang.String arg0, java.lang.String arg1)*
     */
    public java.lang.String getMobieRepairType(java.lang.String arg0, java.lang.String arg1) {
        LOG.info("Executing operation getMobieRepairType");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zfsoft.keyan.IRepairInfoMobileService#getRepairAddress(java.lang.String arg0, java.lang.String arg1)*
     */
    public java.lang.String getRepairAddress(java.lang.String arg0, java.lang.String arg1) {
        LOG.info("Executing operation getRepairAddress");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
