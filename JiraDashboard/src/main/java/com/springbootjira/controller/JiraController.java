package com.springbootjira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjira.entity.JiraFields;
import com.springbootjira.service.JiraService;

@RestController
@RequestMapping("/jira")
public class JiraController {

	@Autowired
	private JiraService jiraservice;
	
	@GetMapping("/getallproject")
	public List<String> getAllProject() {
		return jiraservice.getAllProjects();
	}
	
	@RequestMapping("/getsprint/{project}")
	public List<String> getAllSprint(@PathVariable("project") String project){
		
		return jiraservice.getAllSprints(project);
	}
	
	@RequestMapping("/getdetails/{project}/{sprint}")
    public List<JiraFields> getDetails(@PathVariable("project") String project, @PathVariable("sprint") String sprint){
		
		return jiraservice.getProjectDetails(project, sprint);
	}
}
