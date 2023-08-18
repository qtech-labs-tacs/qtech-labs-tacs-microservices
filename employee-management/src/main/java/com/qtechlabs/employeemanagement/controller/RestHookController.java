package com.qtechlabs.employeemanagement.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabs.employeemanagement.dto.SubscribeDTO;

@RestController
public class RestHookController {

	
	@PostMapping("/api/v1/hook/subscribe")
	public ResponseEntity<String> subscribe(@RequestBody SubscribeDTO subscribeDTO){
		
		
		return new ResponseEntity<>("Subscribed", HttpStatus.CREATED);
	}
		
	
	@GetMapping("/api/v1/hook/subscribe/{subscribeId}")
	public ResponseEntity<String> unsubscribe(@PathVariable UUID subscribeId){
		
		
		return new ResponseEntity<>("Unsubscribed", HttpStatus.OK);
	}
		
}
