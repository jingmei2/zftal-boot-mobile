
package com.zfsoft.backMh.schoolintroduce.CXFServe.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.zfsoft.backMh.schoolintroduce.CXFServe.service.impl.SIntroduceXmlServiceService;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-21T13:47:33.093+08:00
 * Generated source version: 2.6.0
 *
 */
public final class ISIntroduceXmlService_SIntroduceXmlServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.service.schoolintroduce.logic.webservice.general.zfsoft.com/", "SIntroduceXmlServiceService");

    private ISIntroduceXmlService_SIntroduceXmlServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SIntroduceXmlServiceService.WSDL_LOCATION;
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

        SIntroduceXmlServiceService ss = new SIntroduceXmlServiceService(wsdlURL, SERVICE_NAME);
        ISIntroduceXmlService port = ss.getSIntroduceXmlServicePort();

        {
        System.out.println("Invoking getRootSchoolIntroduceTypeList...");
        java.lang.String _getRootSchoolIntroduceTypeList__return = port.getRootSchoolIntroduceTypeList();
        System.out.println("getRootSchoolIntroduceTypeList.result=" + _getRootSchoolIntroduceTypeList__return);


        }
        {
        System.out.println("Invoking getSchoolIntroduceById...");
        java.lang.String _getSchoolIntroduceById_tid = "";
        java.lang.String _getSchoolIntroduceById__return = port.getSchoolIntroduceById(_getSchoolIntroduceById_tid);
        System.out.println("getSchoolIntroduceById.result=" + _getSchoolIntroduceById__return);


        }
        {
        System.out.println("Invoking getSchoolIntroduceTitleList...");
        java.lang.String _getSchoolIntroduceTitleList_id = "";
        int _getSchoolIntroduceTitleList_start = 0;
        int _getSchoolIntroduceTitleList_size = 0;
        java.lang.String _getSchoolIntroduceTitleList__return = port.getSchoolIntroduceTitleList(_getSchoolIntroduceTitleList_id, _getSchoolIntroduceTitleList_start, _getSchoolIntroduceTitleList_size);
        System.out.println("getSchoolIntroduceTitleList.result=" + _getSchoolIntroduceTitleList__return);


        }

        System.exit(0);
    }

}
