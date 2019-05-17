package com.zfsoft.newmobile.LibService.CXFService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;


@WebServiceClient(name = "LibService",
                  wsdlLocation = "http://202.117.255.187:8081/HWWebService/LibServicePort?wsdl",
                  targetNamespace = "http://service.ws.hw.com/")
public class LibService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.hw.com/", "LibService");
    public final static QName LibServicePort = new QName("http://service.ws.hw.com/", "LibServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://202.117.255.187:8081/HWWebService/LibServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LibService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://202.117.255.187:8081/HWWebService/LibServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LibService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LibService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns LibServiceDelegate
     */
    @WebEndpoint(name = "LibServicePort")
    public LibServiceDelegate getLibServicePort() {
        return super.getPort(LibServicePort, LibServiceDelegate.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibServiceDelegate
     */
    @WebEndpoint(name = "LibServicePort")
    public LibServiceDelegate getLibServicePort(WebServiceFeature... features) {
        return super.getPort(LibServicePort, LibServiceDelegate.class, features);
    }

}
