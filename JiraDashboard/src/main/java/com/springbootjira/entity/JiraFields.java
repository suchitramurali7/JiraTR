package com.springbootjira.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jira_Item", schema = "techm")
public class JiraFields implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "issueid")
	private String issueId;
	
	@Column(name = "project")
	private String project;
	
	@Column(name = "issuetype")
	private String issueType;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "reporter")
	private String reporter;
	
	@Column(name = "assignee")
	private String assignee;
	
	@Column(name = "resolution")
	private String resolution;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "bussinessUnit")
	private String businessUnit;
	
	@Column(name = "storypoints")
	private String storyPoints;
	
	@Column(name = "epiclink")
	private String epicLink;
	
	@Column(name = "sprint")
	private String sprint;
	
	@Column(name = "timeestimate")
	private String timeEstimate;
	
	@Column(name = "timespent")
	private String timeSpent;
	
	@Column(name = "timeorignalEstimate")
	private String timeOriginalEstimate;
	
	
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getStoryPoints() {
		return storyPoints;
	}
	public void setStoryPoints(String storyPoints) {
		this.storyPoints = storyPoints;
	}
	public String getEpicLink() {
		return epicLink;
	}
	public void setEpicLink(String epicLink) {
		this.epicLink = epicLink;
	}
	public String getSprint() {
		return sprint;
	}
	public void setSprint(String sprint) {
		this.sprint = sprint;
	}
	public String getTimeEstimate() {
		return timeEstimate;
	}
	public void setTimeEstimate(String timeEstimate) {
		this.timeEstimate = timeEstimate;
	}
	public String getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}
	public String getTimeOriginalEstimate() {
		return timeOriginalEstimate;
	}
	public void setTimeOriginalEstimate(String timeOriginalEstimate) {
		this.timeOriginalEstimate = timeOriginalEstimate;
	}
	@Override
	public String toString() {
		return "JiraFields [issueId=" + issueId + ", project=" + project + ", issueType=" + issueType + ", priority="
				+ priority + ", reporter=" + reporter + ", assignee=" + assignee + ", resolution=" + resolution
				+ ", label=" + label + ", status=" + status + ", businessUnit=" + businessUnit + ", storyPoints="
				+ storyPoints + ", epicLink=" + epicLink + ", sprint=" + sprint + ", timeEstimate=" + timeEstimate
				+ ", timeSpent=" + timeSpent + ", timeOriginalEstimate=" + timeOriginalEstimate + "]";
	}
	
	
}
