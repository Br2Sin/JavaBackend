package com.calmis.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.calmis.common.Constant;

@Service
public class AuthenticationService implements UserDetailsService, Constant {
	private static Logger LOG = LoggerFactory.getLogger(AuthenticationService.class);

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		String response = userService.validate(userName);
				if (!response.equalsIgnoreCase(LOGIN_SUCCESS)) {
			LOG.error(response);
			throw new UsernameNotFoundException(response);
		} else {			 
			 return new User(userName, userName,
		                new ArrayList<>());
		}
	}
}