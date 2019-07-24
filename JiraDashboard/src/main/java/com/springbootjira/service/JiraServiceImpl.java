package com.springbootjira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjira.entity.JiraFields;
import com.springbootjira.repo.JiraRepo;

@Service
public class JiraServiceImpl implements JiraService{

	@Autowired
	private JiraRepo jiraRepo;

	
	@Override
	public List<String> getAllProjects() {
		// TODO Auto-generated method stub
		List<String> list = jiraRepo.findAllProjects();
		 return list;
	}

	

	@Override
	public List<JiraFields> getProjectDetails(String project, String sprint) {
		// TODO Auto-generated method stub
		List<JiraFields> list = jiraRepo.findProjectDetails(project, sprint);
		return list;
	}

	@Override
	public List<String> getAllSprints(String project) {
		 List<String> list=jiraRepo.findSprintName(project);
		return list;
	}

	
	
	
}
