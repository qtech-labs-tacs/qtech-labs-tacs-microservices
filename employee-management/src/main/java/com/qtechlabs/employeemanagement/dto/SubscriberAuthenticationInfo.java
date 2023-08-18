package com.qtechlabs.employeemanagement.dto;

import com.qtechlabs.employeemanagement.dto.enumeration.AuthenticationMechanism;

public class SubscriberAuthenticationInfo {
	
	
	private AuthenticationMechanism authenticationMechanism;

	public AuthenticationMechanism getAuthenticationMechanism() {
		return authenticationMechanism;
	}

	public void setAuthenticationMechanism(AuthenticationMechanism authenticationMechanism) {
		this.authenticationMechanism = authenticationMechanism;
	}

	
}
