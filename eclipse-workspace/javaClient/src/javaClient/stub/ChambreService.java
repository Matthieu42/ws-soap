
package javaClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ChambreService", targetNamespace = "http://appSOAP/", wsdlLocation = "http://localhost:2000/Chambre?wsdl")
public class ChambreService
    extends Service
{

    private final static URL CHAMBRESERVICE_WSDL_LOCATION;
    private final static WebServiceException CHAMBRESERVICE_EXCEPTION;
    private final static QName CHAMBRESERVICE_QNAME = new QName("http://appSOAP/", "ChambreService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2000/Chambre?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHAMBRESERVICE_WSDL_LOCATION = url;
        CHAMBRESERVICE_EXCEPTION = e;
    }

    public ChambreService() {
        super(__getWsdlLocation(), CHAMBRESERVICE_QNAME);
    }

    public ChambreService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHAMBRESERVICE_QNAME, features);
    }

    public ChambreService(URL wsdlLocation) {
        super(wsdlLocation, CHAMBRESERVICE_QNAME);
    }

    public ChambreService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHAMBRESERVICE_QNAME, features);
    }

    public ChambreService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChambreService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Chambre
     */
    @WebEndpoint(name = "ChambrePort")
    public Chambre getChambrePort() {
        return super.getPort(new QName("http://appSOAP/", "ChambrePort"), Chambre.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Chambre
     */
    @WebEndpoint(name = "ChambrePort")
    public Chambre getChambrePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://appSOAP/", "ChambrePort"), Chambre.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHAMBRESERVICE_EXCEPTION!= null) {
            throw CHAMBRESERVICE_EXCEPTION;
        }
        return CHAMBRESERVICE_WSDL_LOCATION;
    }

}