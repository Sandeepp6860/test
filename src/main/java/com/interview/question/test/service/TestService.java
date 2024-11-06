package com.interview.question.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.interview.question.test.entity.ResultDto;
import com.interview.question.test.entity.User;

@Service
public class TestService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<ResultDto> getData(){
		ResponseEntity<List<User>> responseEntity = restTemplate.exchange(
	            "https://jsonplaceholder.typicode.com/users",
	            HttpMethod.GET,
	            null, 
	            new ParameterizedTypeReference<List<User>>() {}
	        );
		
		List<User> response = responseEntity.getBody();
		
		List<ResultDto> collect = response.stream().map(user->{
			double lat=user.getAddress().getGeo().getLat();
			double lng=user.getAddress().getGeo().getLng();
			String name=user.getCompany().getName();
			return new ResultDto(user.getId(),lat,lng,name);
		}).collect(Collectors.toList());
		System.out.println(collect);
		return collect;
	}
}
