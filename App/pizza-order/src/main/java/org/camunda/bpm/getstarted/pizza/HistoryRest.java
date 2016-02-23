package org.camunda.bpm.getstarted.pizza;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/history")
public class HistoryRest { 
	
	/*@Resource(mappedName="java:global/camunda-bpm-platform/process-engine/default")
	  private ProcessEngine processEngine;
			*/
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)  
	public String/*List<ProcessInstance>*/ getAllRunningProcessInstances(String processDefinitionName) {
		
		HistoryBean hb = new HistoryBean();
		return hb.getHistory();
/*		// get process engine and services
	//	ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
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
		
		List<ProcessInstance> processInstances =
				runtimeService.createProcessInstanceQuery()
				.active() // we only want the unsuspended process instances
				.list();
		
		HistoryService historyService = processEngine.getHistoryService();
		HistoricProcessInstanceQuery historicProcessInstanceQuery = historyService.createHistoricProcessInstanceQuery().finished();
		List<HistoricProcessInstance> historicProcessInstanceList = historicProcessInstanceQuery.list();
		
		HistoricProcessInstance historicProcessInstance = historicProcessInstanceList.get(0);
		return historicProcessInstance.toString();*/
	}
 
}