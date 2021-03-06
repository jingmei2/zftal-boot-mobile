package com.zfsoft.backMh.version.CXFService.service.imp;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.zfsoft.backMh.version.CXFService.service.IVersionXmlService;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-11-06T11:28:22.312+08:00
 * Generated source version: 2.5.2
 *
 */
@WebServiceClient(name = "VersionXmlServiceService",
                  wsdlLocation = "http://10.71.19.191:9992/zfmcmh/webservices/version/VersionXmlService?wsdl",
                  targetNamespace = "http://service.version.sys.webservice.general.zfsoft.com/")
public class VersionXmlServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.version.sys.webservice.general.zfsoft.com/", "VersionXmlServiceService");
    public final static QName VersionXmlServicePort = new QName("http://service.version.sys.webservice.general.zfsoft.com/", "VersionXmlServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.19.191:9992/zfmcmh/webservices/version/VersionXmlService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VersionXmlServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.71.19.191:9992/zfmcmh/webservices/version/VersionXmlService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VersionXmlServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VersionXmlServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VersionXmlServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }


    /**
     *
     * @return
     *     returns IVersionXmlService
     */
    @WebEndpoint(name = "VersionXmlServicePort")
    public IVersionXmlService getVersionXmlServicePort() {
        return super.getPort(VersionXmlServicePort, IVersionXmlService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IVersionXmlService
     */
    @WebEndpoint(name = "VersionXmlServicePort")
    public IVersionXmlService getVersionXmlServicePort(WebServiceFeature... features) {
        return super.getPort(VersionXmlServicePort, IVersionXmlService.class, features);
    }

}
