package com.telstra.codechallenge.githubapi;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/github_api")
public class GithubApiController {

	@Autowired
	GithubApiService service;

	@GetMapping("/{noOfrespositeries}")
	List<GithubObject> getHottestRepositories(@PathVariable("noOfrespositeries") Integer noOfrespositeries) {
		return service.getHottestRepositories(noOfrespositeries);
	}
}
