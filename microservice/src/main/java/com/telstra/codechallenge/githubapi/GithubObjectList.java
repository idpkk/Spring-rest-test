package com.telstra.codechallenge.githubapi;

import java.io.Serializable;
import java.util.List;

public class GithubObjectList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	List<GithubObject> items;

	public List<GithubObject> getItems() {
		return items;
	}

	public void setItems(List<GithubObject> items) {
		this.items = items;
	}
	
}
