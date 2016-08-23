
package com.coverity.ws.v6;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DefectServiceService", targetNamespace = "http://ws.coverity.com/v6", wsdlLocation = "http://localhost:8080/ws/v6/defectservice?wsdl")
public class DefectServiceService
    extends Service
{

    private final static URL DEFECTSERVICESERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/v6/defectservice?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        DEFECTSERVICESERVICE_WSDL_LOCATION = url;
    }

    public DefectServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DefectServiceService() {
        super(DEFECTSERVICESERVICE_WSDL_LOCATION, new QName("http://ws.coverity.com/v6", "DefectServiceService"));
    }

    /**
     * 
     * @return
     *     returns DefectService
     */
    @WebEndpoint(name = "DefectServicePort")
    public DefectService getDefectServicePort() {
        return (DefectService)super.getPort(new QName("http://ws.coverity.com/v6", "DefectServicePort"), DefectService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DefectService
     */
    @WebEndpoint(name = "DefectServicePort")
    public DefectService getDefectServicePort(WebServiceFeature... features) {
        return (DefectService)super.getPort(new QName("http://ws.coverity.com/v6", "DefectServicePort"), DefectService.class, features);
    }

}
