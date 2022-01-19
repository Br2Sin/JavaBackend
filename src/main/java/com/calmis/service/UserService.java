package com.calmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.calmis.beans.ResponseEntity;
import com.calmis.beans.Unit;
import com.calmis.beans.UserInfo;
import com.calmis.common.Constant;
import com.calmis.repository.UserRepository;

@Service
public class UserService implements Constant {
	@Autowired
	UserRepository userRepo;

	/**
	 * This method is used to validate the user
	 * @param userId
	 * @return
	 */
	public String validate(String userId) {
		String output = userRepo.validate(userId);
		if (output == null) {
			return LOGIN_DENIED;
		} else if (output.toUpperCase().contains(LOCKED)) {
			return ACCOUNT_LOCKED;
		} else {
			return LOGIN_SUCCESS;
		}
	}

	/**
	 * This method is used to fetch the unit code details
	 * @return
	 */
	public List<Unit> displayEmpList() {
		return userRepo.fetchUnitList();
	}

	/**
	 * THis method is used to fetch the unit code from proc by passing the userid and password
	 * @param user
	 * @return
	 */
	public ResponseEntity authenticateUser(UserInfo user) {
		return userRepo.authenticateUser(user);
	}

	/**
	 * This method will be called once the user clicks on the login button
	 * @param user
	 * @return
	 */
	public ResponseEntity login(UserInfo user) {
		return userRepo.login(user);
	}

	/**
	 * This method is used to get the user account status
	 * @param userId
	 * @return
	 */
	public String checkStatus(String userId) {
		String output =  userRepo.validate(userId);
		if(StringUtils.isEmpty(output)) {
			return "User Not Found";
		}
		return output;
	}

	/**
	 * This method fetches the unit code associated with the userName
	 * @param user
	 * @return
	 */
	public String getUnitCodeByUserName(UserInfo user) {
        //Step1: Validate the UserId
		String output = validate(user.getUsername());
		if(LOGIN_SUCCESS.equals(output)) {
			if(null!=user.getPassword() && !user.getPassword().equals("")) {
				output = userRepo.getUnitCodeByUserName(user.getUsername());
			}else {
				output= "Password can't be empty";	
			}			
		}
		return output;
	}

	/**
	 * This method fetched the unit code details by passing the userName and password
	 * @param user
	 * @return
	 */
	public ResponseEntity fetchUnitCodeDtls(UserInfo user) {
		return userRepo.fetchUnitCodeDtls(user);
	}	
}
