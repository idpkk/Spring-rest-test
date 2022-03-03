package com.telstra.codechallenge.githubapi;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class GithubApiService {

	@Value("${github.api.url}")
	private String BASE_URL;

	@Autowired
	RestTemplate restTemplate;

	public List<GithubObject> getHottestRepositories(Integer noOfrespositeries) {
		String url = BASE_URL + "?q=created:>" + LocalDate.now().minusDays(7)
				+ "&type=repositories&sort=stars&order=desc&per_page=" + noOfrespositeries;
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		if (response.getBody() != null) {
			GithubObjectList list = null;
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				list = mapper.readValue(response.getBody(), GithubObjectList.class);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			return list.getItems();
		}
		return null;
	}
}
