package com.danilodughetti.domainchecker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilodughetti.domainchecker.entity.User;
import com.danilodughetti.domainchecker.model.WhoIsResponse;
import com.danilodughetti.domainchecker.repository.UserRepository;
import com.danilodughetti.domainchecker.service.WhoIsService;
import com.danilodughetti.domainchecker.utils.EndpointConstants;

@RestController
public class TestController {

	@Autowired
	WhoIsService whoIsService;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = EndpointConstants.TEST)
	public ResponseEntity<WhoIsResponse> getTest() {
//		LOGGER.debug(LoggerConstants.LABEL_REQUESTING_WITH_HTTP_METHOD, "GET", EndpointConstants.INFO_STAGE);
		try {
			WhoIsResponse response = this.whoIsService.getDomainInfo("google.com");
			Optional<User> user = this.userRepository.findById("test@gmail.com");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception exception) {
			return new ResponseEntity<>(null, HttpStatus.OK);
//			LOGGER.error(exception.getMessage());
//			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), exception);
		}
	}
	
}
