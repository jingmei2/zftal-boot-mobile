package com.zfsoft.versionVerify.CXFServe.imp;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.zfsoft.versionVerify.CXFServe.IVersionVerifyXmlService;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-01-16T11:51:36.921+08:00
 * Generated source version: 2.6.0
 *
 */
@WebServiceClient(name = "VersionVerifyXmlServiceService",
                  wsdlLocation = "http://localhost:8888/zfmobile_versionMB/webservice/version/VersionVerifyXmlService?wsdl",
                  targetNamespace = "http://imp.service.version.webservice.general.zfsoft.com/")
public class VersionVerifyXmlServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://imp.service.version.webservice.general.zfsoft.com/", "VersionVerifyXmlServiceService");
    public final static QName VersionVerifyXmlServicePort = new QName("http://imp.service.version.webservice.general.zfsoft.com/", "VersionVerifyXmlServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8888/zfmobile_versionMB/webservice/version/VersionVerifyXmlService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VersionVerifyXmlServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8888/zfmobile_versionMB/webservice/version/VersionVerifyXmlService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VersionVerifyXmlServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VersionVerifyXmlServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VersionVerifyXmlServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }


    /**
     *
     * @return
     *     returns IVersionVerifyXmlService
     */
    @WebEndpoint(name = "VersionVerifyXmlServicePort")
    public IVersionVerifyXmlService getVersionVerifyXmlServicePort() {
        return super.getPort(VersionVerifyXmlServicePort, IVersionVerifyXmlService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IVersionVerifyXmlService
     */
    @WebEndpoint(name = "VersionVerifyXmlServicePort")
    public IVersionVerifyXmlService getVersionVerifyXmlServicePort(WebServiceFeature... features) {
        return super.getPort(VersionVerifyXmlServicePort, IVersionVerifyXmlService.class, features);
    }

}
