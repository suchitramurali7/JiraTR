package com.springbootjira.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootjira.entity.JiraFields;
import java.lang.String;

@Repository
public interface JiraRepo extends CrudRepository<JiraFields, String> {

	@Query(value="select j from JiraFields j where j.project=:project and j.sprint=:sprint")
	List<JiraFields>  findProjectDetails(String project, String sprint);
	
	@Query("select j.sprint from JiraFields j where j.project=:project ")
	List<String> findSprintName(String project);
	
	@Query("select j.project from JiraFields j")
	List<String> findAllProjects();
}
