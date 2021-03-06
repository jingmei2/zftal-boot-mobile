
package com.zfsoft.backMh.introduce.CXFServe.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.zfsoft.backMh.introduce.CXFServe.service.impl.IntroduceXmlServiceService;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-05T14:44:16.218+08:00
 * Generated source version: 2.5.2
 *
 */
public final class IIntroduceXmlService_IntroduceXmlServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.introduce.logic.webservice.general.zfsoft.com/", "IntroduceXmlServiceService");

    private IIntroduceXmlService_IntroduceXmlServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IntroduceXmlServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        IntroduceXmlServiceService ss = new IntroduceXmlServiceService(wsdlURL, SERVICE_NAME);
        IIntroduceXmlService port = ss.getIntroduceXmlServicePort();

        {
        System.out.println("Invoking getChildIntroduceTypeList...");
        java.lang.String _getChildIntroduceTypeList_id = "";
        int _getChildIntroduceTypeList_start = 0;
        int _getChildIntroduceTypeList_size = 0;
        java.lang.String _getChildIntroduceTypeList__return = port.getChildIntroduceTypeList(_getChildIntroduceTypeList_id, _getChildIntroduceTypeList_start, _getChildIntroduceTypeList_size);
        System.out.println("getChildIntroduceTypeList.result=" + _getChildIntroduceTypeList__return);


        }
        {
        System.out.println("Invoking getRootIntroduceTypeList...");
        java.lang.String _getRootIntroduceTypeList__return = port.getRootIntroduceTypeList();
        System.out.println("getRootIntroduceTypeList.result=" + _getRootIntroduceTypeList__return);


        }
        {
        System.out.println("Invoking getIntroduceByTypeId...");
        java.lang.String _getIntroduceByTypeId_tid = "";
        java.lang.String _getIntroduceByTypeId__return = port.getIntroduceByTypeId(_getIntroduceByTypeId_tid);
        System.out.println("getIntroduceByTypeId.result=" + _getIntroduceByTypeId__return);


        }
        {
            System.out.println("Invoking getChildIntroduceTypeListAddPid...");
            java.lang.String _getChildIntroduceTypeListAddPid_id = "";
            int _getChildIntroduceTypeListAddPid_start = 0;
            int _getChildIntroduceTypeListAddPid_size = 0;
            java.lang.String _getChildIntroduceTypeListAddPid__return = port.getChildIntroduceTypeListAddPid(_getChildIntroduceTypeListAddPid_id, _getChildIntroduceTypeListAddPid_start, _getChildIntroduceTypeListAddPid_size);
            System.out.println("getChildIntroduceTypeListAddPid.result=" + _getChildIntroduceTypeListAddPid__return);


            }
        System.exit(0);
    }

}
