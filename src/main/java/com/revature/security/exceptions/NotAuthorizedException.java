package com.revature.security.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.FORBIDDEN, reason="You are not authorized to use this application. Please contact technology support if you feel this is in error.")
public class NotAuthorizedException extends RuntimeException{

	private static final long serialVersionUID = 6475690726125781583L;
	
}
