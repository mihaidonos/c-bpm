package com.md.bpm.service;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;

@Path("/history")
public class HistoryService { 
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)  
	public  List<ProcessInstance> getAllRunningProcessInstances(String processDefinitionName) {
		// get process engine and services
		ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
		RuntimeService runtimeService = processEngine.getRuntimeService();
		RepositoryService repositoryService = processEngine.getRepositoryService();			

		// query for latest process definition with given name
		ProcessDefinition myProcessDefinition =
				repositoryService.createProcessDefinitionQuery()
				.processDefinitionName(processDefinitionName)
				.latestVersion()
				.singleResult();	

		// list all running/unsuspended instances of the process
		List<ProcessInstance> processInstances =
				runtimeService.createProcessInstanceQuery()
				.processDefinitionId(myProcessDefinition.getId())
				.active() // we only want the unsuspended process instances
				.list();
		
		return processInstances;
	}
	   
    
}