package com.calmis.repository;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.calmis.beans.ResponseEntity;
import com.calmis.common.QueryConstant;

public class UnitDetailsProc extends StoredProcedure implements QueryConstant {
	private static final String SPROC_NAME = "CALMAIN.PROC_KEY_NEXT_ITEM";
	 

	public UnitDetailsProc(DataSource datasource) {
		super(datasource, SPROC_NAME);
		declareParameter(new SqlParameter(P_SCR_USER, Types.VARCHAR)); 
		declareParameter(new SqlParameter(P_SCR_PASSWORD, Types.VARCHAR)); 
		declareParameter(new SqlOutParameter(MESSAGE_OUT, Types.VARCHAR));
		declareParameter(new SqlOutParameter(ACCOUNT_STATUS, Types.VARCHAR));
		compile();
	}

	public ResponseEntity execute(String userName, String password) {
		Map<String, Object> results=null;
		try {
			results = super.execute(userName,password);
		}catch (Exception e){
			e.printStackTrace();
		}
		ResponseEntity res = new ResponseEntity();
		res.setMessage((String) results.get(MESSAGE_OUT));
		res.setStatus((String) results.get(ACCOUNT_STATUS));
		return res; 		 
	}
}