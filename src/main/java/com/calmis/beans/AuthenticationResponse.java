package com.calmis.beans;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String token;
    private final String message;
    
    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

	public String getMessage() {
		return message;
	}
    
}
