package com.zfsoft.mobile.services.assetWebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2017-11-03T11:39:49.672+08:00
 * Generated source version: 2.6.0
 *
 */
@WebServiceClient(name = "WebService",
                  wsdlLocation = "http://10.10.0.71/ais/images/WebService.asmx?WSDL",
                  targetNamespace = "http://qufeisoft.com/webservices/")
public class WebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://qufeisoft.com/webservices/", "WebService");
    public final static QName WebServiceSoap12 = new QName("http://qufeisoft.com/webservices/", "WebServiceSoap12");
    public final static QName WebServiceSoap = new QName("http://qufeisoft.com/webservices/", "WebServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://10.10.0.71/ais/images/WebService.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.10.0.71/ais/images/WebService.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12() {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap() {
        return super.getPort(WebServiceSoap, WebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap, WebServiceSoap.class, features);
    }

}