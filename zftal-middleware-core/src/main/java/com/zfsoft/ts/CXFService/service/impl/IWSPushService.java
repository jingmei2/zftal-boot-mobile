package com.zfsoft.ts.CXFService.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.zfsoft.ts.CXFService.service.IWSPushServicePortType;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-05-12T10:20:07.250+08:00
 * Generated source version: 2.6.0
 *
 */
@WebServiceClient(name = "IWSPushService",
                  wsdlLocation = "http://10.71.32.117:8080/zftal-mobile/service/IWSPushService?wsdl",
                  targetNamespace = "http://service.cxf.webservices.mobile.zfsoft.com/")
public class IWSPushService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.cxf.webservices.mobile.zfsoft.com/", "IWSPushService");
    public final static QName IWSPushServiceHttpPort = new QName("http://service.cxf.webservices.mobile.zfsoft.com/", "IWSPushServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.32.117:8080/zftal-mobile/service/IWSPushService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IWSPushService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.71.32.117:8080/zftal-mobile/service/IWSPushService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IWSPushService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IWSPushService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IWSPushService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
   /* public IWSPushService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }*/

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
 /*   public IWSPushService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }*/

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
  /*  public IWSPushService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }*/

    /**
     *
     * @return
     *     returns IWSPushServicePortType
     */
    @WebEndpoint(name = "IWSPushServiceHttpPort")
    public IWSPushServicePortType getIWSPushServiceHttpPort() {
        return super.getPort(IWSPushServiceHttpPort, IWSPushServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSPushServicePortType
     */
    @WebEndpoint(name = "IWSPushServiceHttpPort")
    public IWSPushServicePortType getIWSPushServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(IWSPushServiceHttpPort, IWSPushServicePortType.class, features);
    }

}
