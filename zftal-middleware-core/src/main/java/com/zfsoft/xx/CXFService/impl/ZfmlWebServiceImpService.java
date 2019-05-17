package com.zfsoft.zh.xx.CXFService.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.zfsoft.zh.xx.CXFService.ZfmlWebService;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-06-23T15:22:03.421+08:00
 * Generated source version: 2.6.0
 *
 */
@WebServiceClient(name = "ZfmlWebServiceImpService",
                  wsdlLocation = "http://10.71.32.192:8080/zfml/service/zfmlWebService?wsdl",
                  targetNamespace = "http://webservice.zfml.zfsoft.com/")
public class ZfmlWebServiceImpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.zfml.zfsoft.com/", "ZfmlWebServiceImpService");
    public final static QName ZfmlWebServiceImpPort = new QName("http://webservice.zfml.zfsoft.com/", "ZfmlWebServiceImpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.71.32.192:8080/zfml/service/zfmlWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ZfmlWebServiceImpService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.71.32.192:8080/zfml/service/zfmlWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZfmlWebServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZfmlWebServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZfmlWebServiceImpService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
   /* public ZfmlWebServiceImpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ZfmlWebServiceImpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ZfmlWebServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }*/

    /**
     *
     * @return
     *     returns ZfmlWebService
     */
    @WebEndpoint(name = "ZfmlWebServiceImpPort")
    public ZfmlWebService getZfmlWebServiceImpPort() {
        return super.getPort(ZfmlWebServiceImpPort, ZfmlWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZfmlWebService
     */
    @WebEndpoint(name = "ZfmlWebServiceImpPort")
    public ZfmlWebService getZfmlWebServiceImpPort(WebServiceFeature... features) {
        return super.getPort(ZfmlWebServiceImpPort, ZfmlWebService.class, features);
    }

}