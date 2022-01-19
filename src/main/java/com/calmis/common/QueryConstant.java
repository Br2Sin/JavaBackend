package com.calmis.common;

public interface QueryConstant {
	String CHECK_USER_ACCOUNT_STATUS = "SELECT account_status  FROM dba_users  WHERE UPPER(username) = UPPER(?)";
	String GET_UNIT_CODE = "SELECT distinct lpad(to_char(unit_cde), 6, '0') as unit_code FROM ILS.pers_register WHERE signon_id = substr(?, 2, 13)";

	String ERROR_MSG = "err_msg";
	String ERROR_INDICATOR = "err_ind";
	String COMMON_CODE = "o_comnd_cde";
	String ORG_FUNCTION = "o_org_func";
	String CALMIS_INDICATOR = "o_calmis_ind";
	String AMMO_DEPOT_IND = "o_ammo_depot_ind";
	String PROC_UNIT = "proc_unit";
	String PROC_NAME = "proc_name";
	String PROC_ACCOUNT_IND = "proc_acnt_ind";
	String PROC_LN_IND = "proc_ln_ind";
	String PROC_ACT_DESC = "proc_act_des";
	String P_SCR_USER = "p_scr_user";
	String P_UNIT_CODE = "p_unit_cde";
	String MESSAGEOUT = "msgout";
	String LOGIN_FLAG = "login_flag";
	String P_SCR_PASSWORD = "p_scr_password";

	String MESSAGE_OUT = "msg_out";
	String ACCOUNT_STATUS = "lv_scr_accnt_stat";
}
