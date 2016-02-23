package org.camunda.bpm.getstarted.pizza;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;

public class HistoryBean {

	public String getHistory(){
		
		
		// get process engine and services
	//	ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	/*	RuntimeService runtimeService = processEngine.getRuntimeService();
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
		return "aa";
		
	}
}
