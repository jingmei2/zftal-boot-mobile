package com.zfsoft.oa.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2018-09-14T15:42:56.190+08:00
 * Generated source version: 2.6.0
 *
 */
@WebServiceClient(name = "OaMobileServiceImplService",
                  wsdlLocation = "http://10.71.33.61:8081/zfwebservice/ws/oaMobileService?wsdl",
                  targetNamespace = "http://impl.service.oa.portal.webservice.zfsoft.com/")
public class OaMobileServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.oa.portal.webservice.zfsoft.com/", "OaMobileServiceImplService");
    public final static QName OaMobileServiceImplPort = new QName("http://impl.service.oa.portal.webservice.zfsoft.com/", "OaMobileServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.33.61:8081/zfwebservice/ws/oaMobileService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OaMobileServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.71.33.61:8081/zfwebservice/ws/oaMobileService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OaMobileServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OaMobileServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OaMobileServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }


    /**
     *
     * @return
     *     returns IOaMobileService
     */
    @WebEndpoint(name = "OaMobileServiceImplPort")
    public IOaMobileService getOaMobileServiceImplPort() {
        return super.getPort(OaMobileServiceImplPort, IOaMobileService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOaMobileService
     */
    @WebEndpoint(name = "OaMobileServiceImplPort")
    public IOaMobileService getOaMobileServiceImplPort(WebServiceFeature... features) {
        return super.getPort(OaMobileServiceImplPort, IOaMobileService.class, features);
    }

}
