package com.md.bpm.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.md.bpm.history.HistoryBean;

@Path("/history")
public class HistoryService {  
	 
	@GET
	@Path("/test")
 	@Produces(MediaType.TEXT_PLAIN)  
	public  String /*List<ProcessInstance>*/ getAllRunningProcessInstances(String processDefinitionName) { 
		HistoryBean hb = new HistoryBean();
		
		System.out.println(hb.getHistory());
		return "Dasdsa";//processInstances;
	}
 
}