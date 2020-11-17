package com.danilodughetti.domainchecker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilodughetti.domainchecker.config.ApplicationProperties;
import com.danilodughetti.domainchecker.utils.EndpointConstants;

@RestController
public class TestController {

	@Autowired
	ApplicationProperties applicationProperties;
	
	@GetMapping(value = EndpointConstants.TEST)
	public ResponseEntity<String> getTest() {
//		LOGGER.debug(LoggerConstants.LABEL_REQUESTING_WITH_HTTP_METHOD, "GET", EndpointConstants.INFO_STAGE);
		try {
			
			return new ResponseEntity<>(this.applicationProperties.getWhoIsApiKey(), HttpStatus.OK);
		} catch (Exception exception) {
			return new ResponseEntity<>("KO", HttpStatus.OK);
//			LOGGER.error(exception.getMessage());
//			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), exception);
		}
	}
	
}
