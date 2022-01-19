package com.calmis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calmis.beans.ResponseEntity;
import com.calmis.beans.UserInfo;
import com.calmis.service.UserService;
import com.calmis.util.Validations;

@RestController
@RequestMapping("/api")
public class UserController {

	private static Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTest() {
		return "Testing API";
	}

	/**
	 * This method is used to validate the user based on the input parameter
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "validateUser/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity validateUser(@PathVariable("userId") String userId) {
		LOG.info("Inside validateUser");
		String output = Validations.isValidUser(userId);
		if (output.equals("")) {
			output = userService.validate(userId);
		}
		ResponseEntity res = new ResponseEntity();
		res.setMessage(output);
		return res;
	}

	@RequestMapping(value = "checkAcctStatus/{userId}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity checkAccountStatus(@PathVariable("userId") String userId) {
		LOG.info("Inside checkAccountStatus");
		ResponseEntity res = new ResponseEntity();
		res.setStatus(userService.checkStatus(userId));
		return res;
	}

	@RequestMapping(value = "getUnitCodeById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getUnitCodeById(@RequestBody UserInfo user) {
		LOG.info("Inside getUnitCodeById");
		ResponseEntity res = new ResponseEntity();
		res.setMessage(userService.getUnitCodeByUserName(user));
		return res;		 
	}

	@RequestMapping(value = "authenticateUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity authenticateUser(@RequestBody UserInfo user) {
		LOG.info("Inside authenticateUser");
		return userService.authenticateUser(user);
	}

	@RequestMapping(value = "login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity login(@RequestBody UserInfo user) {
		LOG.info("Inside login");
		return userService.login(user);
	}
	
	@RequestMapping(value = "fetchUnitCodeDtls", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchUnitCodeDtls(@RequestBody UserInfo user) {
		LOG.info("Inside fetchUnitCodeDtls");
		return userService.fetchUnitCodeDtls(user);
	}
}