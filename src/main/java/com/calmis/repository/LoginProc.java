package com.calmis.repository;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.calmis.beans.ResponseEntity;
import com.calmis.common.QueryConstant;

public class LoginProc extends StoredProcedure implements QueryConstant{
	private static final String SPROC_NAME = "CALMAIN.PROC_LOGIN_BUTTON";
	
	public LoginProc(DataSource datasource) {
		super(datasource, SPROC_NAME);
		declareParameter(new SqlParameter(P_SCR_USER, Types.VARCHAR)); 
		declareParameter(new SqlParameter(P_UNIT_CODE, Types.VARCHAR)); 
		declareParameter(new SqlOutParameter(MESSAGEOUT, Types.VARCHAR)); 
		declareParameter(new SqlOutParameter(LOGIN_FLAG, Types.VARCHAR));
		compile();
	}

	public ResponseEntity execute(String userName, String unitCode) {
		Map<String, Object> results = super.execute(userName,unitCode);
		ResponseEntity res = new ResponseEntity();
		res.setMessage((String) results.get(MESSAGEOUT));
		res.setLoginFlag((String) results.get(LOGIN_FLAG));
		return res; 
	}
}