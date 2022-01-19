package com.calmis.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseEntity {
	@JsonProperty("ammoDepositInd")
	private String ammoDepositInd;
	@JsonProperty("calmisInd")
	private String calmisInd;
	@JsonProperty("comndCode")
	private String comndCode;
	@JsonProperty("errInd")
	private String errInd;
	@JsonProperty("errorMsg")
	private String errorMsg;
	@JsonProperty("message")
	private String message;
	@JsonProperty("orgFunction")
	private String orgFunction;
	@JsonProperty("status")
	private String status;
	@JsonProperty("unitCode")
	private String unitCode;
	@JsonProperty("unitName")
	private String unitName;

	@JsonProperty("loginFlag")
	private String loginFlag;
	/**
	 * @return the ammoDepositInd
	 */
	public String getAmmoDepositInd() {
		return ammoDepositInd;
	}

	/**
	 * @return the calmisInd
	 */
	public String getCalmisInd() {
		return calmisInd;
	}

	/**
	 * @return the loginFlag
	 */
	public String getLoginFlag() {
		return loginFlag;
	}

	/**
	 * @param loginFlag the loginFlag to set
	 */
	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	/**
	 * @return the comndCode
	 */
	public String getComndCode() {
		return comndCode;
	}

	/**
	 * @return the errInd
	 */
	public String getErrInd() {
		return errInd;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the orgFunction
	 */
	public String getOrgFunction() {
		return orgFunction;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the unitCode
	 */
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * @param ammoDepositInd
	 *            the ammoDepositInd to set
	 */
	public void setAmmoDepositInd(String ammoDepositInd) {
		this.ammoDepositInd = ammoDepositInd;
	}

	/**
	 * @param calmisInd
	 *            the calmisInd to set
	 */
	public void setCalmisInd(String calmisInd) {
		this.calmisInd = calmisInd;
	}

	/**
	 * @param comndCode
	 *            the comndCode to set
	 */
	public void setComndCode(String comndCode) {
		this.comndCode = comndCode;
	}

	/**
	 * @param errInd
	 *            the errInd to set
	 */
	public void setErrInd(String errInd) {
		this.errInd = errInd;
	}

	/**
	 * @param errorMsg
	 *            the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param orgFunction
	 *            the orgFunction to set
	 */
	public void setOrgFunction(String orgFunction) {
		this.orgFunction = orgFunction;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param unitCode
	 *            the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @param unitName
	 *            the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
}