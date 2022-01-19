package com.calmis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calmis.beans.AuthenticationResponse;
import com.calmis.beans.UserInfo;
import com.calmis.common.Constant;
import com.calmis.service.AuthenticationService;
import com.calmis.service.UserService;
import com.calmis.util.JwtUtil;

@RestController
@RequestMapping("/api")
public class AuthenticationController implements Constant {
	private static Logger LOG = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	UserService userService;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private AuthenticationService userDetailsService;

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody UserInfo authReq) {
		LOG.info("Inside createAuthenticationToken method" );
		HttpStatus status = HttpStatus.OK;
		AuthenticationResponse response = null;
		try {
			final UserDetails userDetails = userDetailsService.loadUserByUsername(authReq.getUsername());
			final String jwt = jwtTokenUtil.generateToken(userDetails.getUsername());
			response = new AuthenticationResponse(jwt, "Request Processed Successfully");
		}catch(UsernameNotFoundException e) {
			status = HttpStatus.BAD_REQUEST;
			response = new AuthenticationResponse(null, e.getMessage());
		}
		return ResponseEntity.status(status).body(response);		
	}

}//its workin yes ihad to waite  miuutes