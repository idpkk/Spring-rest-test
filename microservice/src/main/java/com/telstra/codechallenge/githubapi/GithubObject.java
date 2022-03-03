package com.telstra.codechallenge.githubapi;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GithubObject  implements Serializable {

	private static final long serialVersionUID = 1L;
	private String htmlUrl;
	private Integer watchersCount;
	private String language;
	private String description;
	private String name;
	
	public String getHtmlUrl() {
		return htmlUrl;
	}
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	public Integer getWatchersCount() {
		return watchersCount;
	}
	public void setWatchersCount(Integer watchersCount) {
		this.watchersCount = watchersCount;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
