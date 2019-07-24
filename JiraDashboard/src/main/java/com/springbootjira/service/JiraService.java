package com.springbootjira.service;

import java.util.List;

import com.springbootjira.entity.JiraFields;

public interface JiraService {

	List<String> getAllProjects();

	List<String>  getAllSprints(String project);
	
	List<JiraFields> getProjectDetails(String project, String sprint);
}
