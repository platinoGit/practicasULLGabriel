package com.mycompany.project.plexus.cxf.contractfirst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.6
 * 2022-04-01T11:00:31.425+01:00
 * Generated source version: 3.4.6
 *
 */
@WebService(targetNamespace = "http://contractfirst.cxf.plexus.project.mycompany.com", name = "TestEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestEndpoint {

    @WebMethod(action = "http://contractfirst.cxf.plexus.project.mycompany.com/Test")
    @WebResult(name = "resultCode", targetNamespace = "http://contractfirst.cxf.plexus.project.mycompany.com", partName = "resultCode")
    public java.lang.String test(

        @WebParam(partName = "parameters", name = "TestOrder", targetNamespace = "http://contractfirst.cxf.plexus.project.mycompany.com")
        TestOrder parameters
    );
}
