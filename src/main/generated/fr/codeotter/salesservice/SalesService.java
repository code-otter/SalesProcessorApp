
/*
 * 
 */

package fr.codeotter.salesservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.3
 * Sun Dec 13 23:16:36 CET 2015
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "SalesService", 
                  wsdlLocation = "file:/home/swinside/IdeaProjects/SalesProcessorApp/src/main/resources/wsdl/sales-service.wsdl",
                  targetNamespace = "http://codeotter.fr/salesservice.wsdl") 
public class SalesService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://codeotter.fr/salesservice.wsdl", "SalesService");
    public final static QName SalesServicePort = new QName("http://codeotter.fr/salesservice.wsdl", "SalesServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/swinside/IdeaProjects/SalesProcessorApp/src/main/resources/wsdl/sales-service.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/home/swinside/IdeaProjects/SalesProcessorApp/src/main/resources/wsdl/sales-service.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SalesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SalesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalesService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns AllSalesPortType
     */
    @WebEndpoint(name = "SalesServicePort")
    public AllSalesPortType getSalesServicePort() {
        return super.getPort(SalesServicePort, AllSalesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AllSalesPortType
     */
    @WebEndpoint(name = "SalesServicePort")
    public AllSalesPortType getSalesServicePort(WebServiceFeature... features) {
        return super.getPort(SalesServicePort, AllSalesPortType.class, features);
    }

}
