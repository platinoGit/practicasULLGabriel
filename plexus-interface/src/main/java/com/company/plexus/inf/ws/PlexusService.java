package com.company.plexus.inf.ws;

import javax.jws.WebMethod;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.WebParam;
import javax.xml.ws.*;

import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Procedure;
import com.company.plexus.utils.Service;

@WebService(
			name = "query",
			serviceName = "queryService",
			portName = "queryServicePort",
			targetNamespace = "http://contractfirst.cxf.plexus.project.mycompany.com"
			)

public interface PlexusService {
	@WebMethod
	@WebResult(name = "selectServiceByAdminUnity")
	Service selectServiceByAdminUnity(@WebParam(name = "administrativeUnity") AdminUnity administrativeUnity);
	
	@WebMethod
	@WebResult(name = "selectServiceByDeparment")
	Service selectServiceByDeparment(@WebParam(name = "department") Department department);
	
	@WebMethod
	@WebResult(name = "selectServiceByAdminLevel")
	Service selectServiceByAdminLevel(@WebParam(name = "level") String level);
	
	@WebMethod
	@WebResult(name = "selectProcedureByAdminUnity")
	Procedure selectProcedureByAdminUnity(@WebParam(name = "administrativeUnity") AdminUnity administrativeUnity);
	
	@WebMethod
	@WebResult(name = "selectProcedureByDeparment")
	Procedure selectProcedureByDeparment(@WebParam(name = "department") Department department);
	
	@WebMethod
	@WebResult(name = "selectProcedureByAdminLevel")
	Procedure selectProcedureByAdminLevel(@WebParam(name = "level") String level);
	
	@WebMethod
	@WebResult(name = "createProcedure")
	void createProcedure(@WebParam(name = "procedure") Procedure procedure);
	
	@WebMethod
	@WebResult(name = "updateProcedure")
	void updateProcedure(@WebParam(name = "procedureId") String procedureId, @WebParam(name = "newProcedure") Procedure newProcedure);
	
	@WebMethod
	@WebResult(name = "deleteProcedure")
	void deleteProcedure(@WebParam(name = "ProcedureId") String procedureId);
	
	@WebMethod
	@WebResult(name = "createService")
	void createService(@WebParam(name = "service") Service service);
	
	@WebMethod
	@WebResult(name = "updateService")
	void updateService(@WebParam(name = "serviceId") String serviceId, @WebParam(name = "newService") Service newService);
	
	@WebMethod
	@WebResult(name = "deleteService")
	void deleteService(@WebParam(name = "serviceId") String serviceId);
}
