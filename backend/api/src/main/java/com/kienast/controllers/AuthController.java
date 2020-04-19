package com.kienast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kienast.rest.api.AuthApi;
import com.kienast.rest.api.model.LoginRequestModel;
import com.kienast.rest.api.model.LoginResponseModel;

@RestController
public class AuthController implements AuthApi {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${authentication}")
	private String authenticationURL;

	@Override
	public ResponseEntity<LoginResponseModel> authenticationlogin(LoginRequestModel loginRequestModel) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<LoginRequestModel> entity = new HttpEntity<LoginRequestModel>(loginRequestModel,headers);	
		return ResponseEntity.ok(restTemplate.postForObject(authenticationURL + "/auth", entity, LoginResponseModel.class));
	}

}
