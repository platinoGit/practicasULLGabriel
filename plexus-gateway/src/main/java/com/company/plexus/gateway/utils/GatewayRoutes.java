package com.company.plexus.gateway.utils;
import org.apache.camel.builder.RouteBuilder;

public class GatewayRoutes extends RouteBuilder {
	@Override
	public void configure() {
		from("direct-vm:plexus-gateway").routeId("plexus-gateway")
		.to("bean:DataGetter?method=getData");
	}
}
