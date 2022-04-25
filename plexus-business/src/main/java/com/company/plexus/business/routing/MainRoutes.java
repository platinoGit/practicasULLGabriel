package com.company.plexus.business.routing;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
public class MainRoutes extends RouteBuilder {
	@Override
	public void configure() {
		
		from("direct-vm:plexus-business").routeId("plexus-business")
		.choice()
		
		.when(header(CxfConstants.OPERATION_NAME))
		.to("bean:businessLogic?method=selectProcedureByAdminUnity");
	}
}
