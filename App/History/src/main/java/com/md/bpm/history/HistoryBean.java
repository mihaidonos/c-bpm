package com.md.bpm.history;

import java.util.List;

//import javax.ejb.Stateless;

import org.camunda.bpm.engine.CaseService;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ExternalTaskService;
import org.camunda.bpm.engine.FilterService;
import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;

//@Stateless
public class HistoryBean {

	public HistoryBean(){
		
	}
	public String getHistory(){
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		RepositoryService repositoryService = processEngine.getRepositoryService();
		RuntimeService runtimeService = processEngine.getRuntimeService();
		TaskService taskService = processEngine.getTaskService();
		IdentityService identityService = processEngine.getIdentityService();
		FormService formService = processEngine.getFormService();
		HistoryService historyService = processEngine.getHistoryService();
		ManagementService managementService = processEngine.getManagementService();
		FilterService filterService = processEngine.getFilterService();
		ExternalTaskService externalTaskService = processEngine.getExternalTaskService();
		CaseService caseService = processEngine.getCaseService();
		DecisionService decisionService = processEngine.getDecisionService();
		
		// query for latest process definition with given name
		ProcessDefinition myProcessDefinition =
				repositoryService.createProcessDefinitionQuery()
				.processDefinitionName("Order Pizza")
				.latestVersion()
				.singleResult();	
		List<ProcessInstance> processInstances =
				runtimeService.createProcessInstanceQuery()
				.processDefinitionId(myProcessDefinition.getId())
				.active() // we only want the unsuspended process instances
				.list();
		Task task = taskService.createTaskQuery().processInstanceId(processInstances.get(0).getId()).singleResult();
		User user = identityService.createUserQuery().userLastNameLike("root").singleResult();
	//    taskService.setAssignee(task.getId(), user.getId()); 
		return processInstances.toString();
		// get process engine and services
	//	ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
	//	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
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
		
		
	}
}
