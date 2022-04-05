package com.company.plexus.inf.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.WebParam;
import javax.xml.ws.*;

@WebService(
			name = "query",
			serviceName = "queryService",
			portName = "queryServicePort",
			targetNamespace = "http://contractfirst.cxf.plexus.project.mycompany.com"
			)

public interface PlexusService {
	@WebMethod
	@WebResult(name = "Service")
	String selectService(@WebParam(name = "serviceID") String serviceID);
}
