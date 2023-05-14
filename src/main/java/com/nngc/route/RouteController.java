package com.nngc.route;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController{
	private final RouteService routeService;
	public RouteController(RouteService routeService){
		this.routeService = routeService;
	}
	@PostMapping("/route")
	public RouteResponse postGreeting(@RequestBody RouteRequest routeRequest){
		// String startTime = request.getStartTime();
		// String optimizationType = request.getOptimizationType();
		// String startLocation = Double.toString(request.getStartLocation().getLatitude());
		// String response = "Start Time: " + startTime + " Optimization Type: " + optimizationType+" Start Location: "+startLocation;
		// RouteResponse routeResponse = new RouteResponse();
		return routeService.calculateOptimizedRoute(routeRequest);
	}
	@GetMapping("/hello")
	public String getHello(){
		return "HELLO FROM GET";
	}
}
