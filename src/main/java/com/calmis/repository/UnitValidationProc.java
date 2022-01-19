package com.calmis.repository;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.calmis.beans.ResponseEntity;
import com.calmis.common.QueryConstant;

public class UnitValidationProc extends StoredProcedure implements QueryConstant{
	private static final String SPROC_NAME = "LLCS_UNIT_VALIDATE";
   
	public UnitValidationProc(DataSource datasource) {
		super(datasource, SPROC_NAME);
		declareParameter(new SqlParameter(PROC_UNIT, Types.INTEGER));
		declareParameter(new SqlInOutParameter(PROC_NAME, Types.VARCHAR));
		declareParameter(new SqlInOutParameter(PROC_ACCOUNT_IND, Types.INTEGER));
		declareParameter(new SqlInOutParameter(PROC_LN_IND, Types.VARCHAR));
		declareParameter(new SqlInOutParameter(PROC_ACT_DESC, Types.VARCHAR));
		declareParameter(new SqlOutParameter(CALMIS_INDICATOR, Types.VARCHAR));
		declareParameter(new SqlOutParameter(AMMO_DEPOT_IND, Types.VARCHAR));
		declareParameter(new SqlOutParameter(ORG_FUNCTION, Types.VARCHAR));
		declareParameter(new SqlOutParameter(COMMON_CODE, Types.INTEGER));
		declareParameter(new SqlOutParameter(ERROR_INDICATOR, Types.VARCHAR));
		declareParameter(new SqlOutParameter(ERROR_MSG, Types.VARCHAR));
		compile();
	}

	public ResponseEntity execute(String unitCode) {
		Map<String, Object> results = super.execute(unitCode, null, null, null, null);
		ResponseEntity res = new ResponseEntity();
		res.setErrInd((String) results.get(ERROR_INDICATOR));
		res.setErrorMsg((String) results.get(ERROR_MSG));
		res.setCalmisInd((String) results.get(CALMIS_INDICATOR));
		res.setAmmoDepositInd((String) results.get(AMMO_DEPOT_IND));
		res.setOrgFunction((String) results.get(ORG_FUNCTION));
		res.setComndCode(String.valueOf(results.get(COMMON_CODE)));
		return res;

	}
}