package com.company.plexus.entrypoint.utils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

public class EntrypointRoutes extends RouteBuilder {
	@Override
	public void configure() {
		from("cxf:bean:plexus-entrypoint").routeId("plexus-entrypoint")
		.choice()
		
		.when(header(CxfConstants.OPERATION_NAME))
		.to("direct-vm:plexus-business");
		
		from("seda:incomingOrders").to("mock:end");
	}
}
