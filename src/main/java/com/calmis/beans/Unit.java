package com.calmis.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Unit {

	@JsonProperty("unitCde")
	private int unitCde;
	@JsonProperty("engAbbrNme")
	private String engAbbrNme;
	@JsonProperty("afrAbbrNme")
	private String afrAbbrNme;
	@JsonProperty("auth")
	private String auth;
	@JsonProperty("engNme")
	private String engNme;
	@JsonProperty("unitActvCde")
	private String unitActvCde;
	@JsonProperty("faxTelNo1")
	private String faxTelNo1;
	@JsonProperty("faxTelno2")
	private String faxTelno2;
	@JsonProperty("acntStatInd")
	private String acntStatInd;
	@JsonProperty("afrNme")
	private String afrNme;
	@JsonProperty("orgStatInd")
	private String orgStatInd;
	@JsonProperty("orgChngDte")
	private Date orgChngDte;
	@JsonProperty("sadfGrpCde")
	private String sadfGrpCde;
	@JsonProperty("telNo")
	private String telNo;
	@JsonProperty("telxNo")
	private String telxNo;
	@JsonProperty("unitLnInd")
	private String unitLnInd;
	@JsonProperty("commdCde")
	private String commdCde;
	@JsonProperty("funcImlicInd")
	private String funcImlicInd;
	@JsonProperty("opsStatCde")
	private String opsStatCde;
	@JsonProperty("orgFunc")
	private String orgFunc;
	@JsonProperty("mobInd")
	private String mobInd;
	@JsonProperty("demobDte")
	private Date demobDte;
	@JsonProperty("mobFte")
	private Date mobFte;
	@JsonProperty("forceActDes")
	private String forceActDes;
	@JsonProperty("untcompInd")
	private String untcompInd;
	@JsonProperty("telegrAddr")
	private String telegrAddr;
	@JsonProperty("sidingNo")
	private String sidingNo;
	@JsonProperty("calmisInd")
	private String calmisInd;
	@JsonProperty("nodeId")
	private Long nodeId;
	@JsonProperty("dimsUimsCde")
	private String dimsUimsCde;
	@JsonProperty("ammoDepotInd")
	private String ammoDepotInd;
	@JsonProperty("osisInd")
	private String osisInd;
	@JsonProperty("paraJobCapabInd")
	private String paraJobCapabInd;
	@JsonProperty("paraSeaJumpLtdInd")
	private String paraSeaJumpLtdInd;
	@JsonProperty("paraPickListApplicInd")
	private String paraPickListApplicInd;
	@JsonProperty("adminHq")
	private Long adminHq;
	@JsonProperty("externalDepInd")
	private String externalDepInd;
	@JsonProperty("geogrCde")
	private String geogrCde;
	@JsonProperty("oliInd")
	private String oliInd;
	@JsonProperty("electStkTkeInd")
	private String electStkTkeInd;
	@JsonProperty("assetMigInd")
	private String assetMigInd;

	/**
	 * @return the unitCde
	 */
	public int getUnitCde() {
		return unitCde;
	}

	/**
	 * @param unitCde
	 *            the unitCde to set
	 */
	public void setUnitCde(int unitCde) {
		this.unitCde = unitCde;
	}

	/**
	 * @return the engAbbrNme
	 */
	public String getEngAbbrNme() {
		return engAbbrNme;
	}

	/**
	 * @param engAbbrNme
	 *            the engAbbrNme to set
	 */
	public void setEngAbbrNme(String engAbbrNme) {
		this.engAbbrNme = engAbbrNme;
	}

	/**
	 * @return the afrAbbrNme
	 */
	public String getAfrAbbrNme() {
		return afrAbbrNme;
	}

	/**
	 * @param afrAbbrNme
	 *            the afrAbbrNme to set
	 */
	public void setAfrAbbrNme(String afrAbbrNme) {
		this.afrAbbrNme = afrAbbrNme;
	}

	/**
	 * @return the auth
	 */
	public String getAuth() {
		return auth;
	}

	/**
	 * @param auth
	 *            the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}

	/**
	 * @return the engNme
	 */
	public String getEngNme() {
		return engNme;
	}

	/**
	 * @param engNme
	 *            the engNme to set
	 */
	public void setEngNme(String engNme) {
		this.engNme = engNme;
	}

	/**
	 * @return the unitActvCde
	 */
	public String getUnitActvCde() {
		return unitActvCde;
	}

	/**
	 * @param unitActvCde
	 *            the unitActvCde to set
	 */
	public void setUnitActvCde(String unitActvCde) {
		this.unitActvCde = unitActvCde;
	}

	/**
	 * @return the faxTelNo1
	 */
	public String getFaxTelNo1() {
		return faxTelNo1;
	}

	/**
	 * @param faxTelNo1
	 *            the faxTelNo1 to set
	 */
	public void setFaxTelNo1(String faxTelNo1) {
		this.faxTelNo1 = faxTelNo1;
	}

	/**
	 * @return the faxTelno2
	 */
	public String getFaxTelno2() {
		return faxTelno2;
	}

	/**
	 * @param faxTelno2
	 *            the faxTelno2 to set
	 */
	public void setFaxTelno2(String faxTelno2) {
		this.faxTelno2 = faxTelno2;
	}

	/**
	 * @return the acntStatInd
	 */
	public String getAcntStatInd() {
		return acntStatInd;
	}

	/**
	 * @param acntStatInd
	 *            the acntStatInd to set
	 */
	public void setAcntStatInd(String acntStatInd) {
		this.acntStatInd = acntStatInd;
	}

	/**
	 * @return the afrNme
	 */
	public String getAfrNme() {
		return afrNme;
	}

	/**
	 * @param afrNme
	 *            the afrNme to set
	 */
	public void setAfrNme(String afrNme) {
		this.afrNme = afrNme;
	}

	/**
	 * @return the orgStatInd
	 */
	public String getOrgStatInd() {
		return orgStatInd;
	}

	/**
	 * @param orgStatInd
	 *            the orgStatInd to set
	 */
	public void setOrgStatInd(String orgStatInd) {
		this.orgStatInd = orgStatInd;
	}

	/**
	 * @return the orgChngDte
	 */
	public Date getOrgChngDte() {
		return orgChngDte;
	}

	/**
	 * @param orgChngDte
	 *            the orgChngDte to set
	 */
	public void setOrgChngDte(Date orgChngDte) {
		this.orgChngDte = orgChngDte;
	}

	/**
	 * @return the sadfGrpCde
	 */
	public String getSadfGrpCde() {
		return sadfGrpCde;
	}

	/**
	 * @param sadfGrpCde
	 *            the sadfGrpCde to set
	 */
	public void setSadfGrpCde(String sadfGrpCde) {
		this.sadfGrpCde = sadfGrpCde;
	}

	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}

	/**
	 * @param telNo
	 *            the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	/**
	 * @return the telxNo
	 */
	public String getTelxNo() {
		return telxNo;
	}

	/**
	 * @param telxNo
	 *            the telxNo to set
	 */
	public void setTelxNo(String telxNo) {
		this.telxNo = telxNo;
	}

	/**
	 * @return the unitLnInd
	 */
	public String getUnitLnInd() {
		return unitLnInd;
	}

	/**
	 * @param unitLnInd
	 *            the unitLnInd to set
	 */
	public void setUnitLnInd(String unitLnInd) {
		this.unitLnInd = unitLnInd;
	}

	/**
	 * @return the commdCde
	 */
	public String getCommdCde() {
		return commdCde;
	}

	/**
	 * @param commdCde
	 *            the commdCde to set
	 */
	public void setCommdCde(String commdCde) {
		this.commdCde = commdCde;
	}

	/**
	 * @return the funcImlicInd
	 */
	public String getFuncImlicInd() {
		return funcImlicInd;
	}

	/**
	 * @param funcImlicInd
	 *            the funcImlicInd to set
	 */
	public void setFuncImlicInd(String funcImlicInd) {
		this.funcImlicInd = funcImlicInd;
	}

	/**
	 * @return the opsStatCde
	 */
	public String getOpsStatCde() {
		return opsStatCde;
	}

	/**
	 * @param opsStatCde
	 *            the opsStatCde to set
	 */
	public void setOpsStatCde(String opsStatCde) {
		this.opsStatCde = opsStatCde;
	}

	/**
	 * @return the orgFunc
	 */
	public String getOrgFunc() {
		return orgFunc;
	}

	/**
	 * @param orgFunc
	 *            the orgFunc to set
	 */
	public void setOrgFunc(String orgFunc) {
		this.orgFunc = orgFunc;
	}

	/**
	 * @return the mobInd
	 */
	public String getMobInd() {
		return mobInd;
	}

	/**
	 * @param mobInd
	 *            the mobInd to set
	 */
	public void setMobInd(String mobInd) {
		this.mobInd = mobInd;
	}

	/**
	 * @return the demobDte
	 */
	public Date getDemobDte() {
		return demobDte;
	}

	/**
	 * @param demobDte
	 *            the demobDte to set
	 */
	public void setDemobDte(Date demobDte) {
		this.demobDte = demobDte;
	}

	/**
	 * @return the mobFte
	 */
	public Date getMobFte() {
		return mobFte;
	}

	/**
	 * @param mobFte
	 *            the mobFte to set
	 */
	public void setMobFte(Date mobFte) {
		this.mobFte = mobFte;
	}

	/**
	 * @return the forceActDes
	 */
	public String getForceActDes() {
		return forceActDes;
	}

	/**
	 * @param forceActDes
	 *            the forceActDes to set
	 */
	public void setForceActDes(String forceActDes) {
		this.forceActDes = forceActDes;
	}

	/**
	 * @return the untcompInd
	 */
	public String getUntcompInd() {
		return untcompInd;
	}

	/**
	 * @param untcompInd
	 *            the untcompInd to set
	 */
	public void setUntcompInd(String untcompInd) {
		this.untcompInd = untcompInd;
	}

	/**
	 * @return the telegrAddr
	 */
	public String getTelegrAddr() {
		return telegrAddr;
	}

	/**
	 * @param telegrAddr
	 *            the telegrAddr to set
	 */
	public void setTelegrAddr(String telegrAddr) {
		this.telegrAddr = telegrAddr;
	}

	/**
	 * @return the sidingNo
	 */
	public String getSidingNo() {
		return sidingNo;
	}

	/**
	 * @param sidingNo
	 *            the sidingNo to set
	 */
	public void setSidingNo(String sidingNo) {
		this.sidingNo = sidingNo;
	}

	/**
	 * @return the calmisInd
	 */
	public String getCalmisInd() {
		return calmisInd;
	}

	/**
	 * @param calmisInd
	 *            the calmisInd to set
	 */
	public void setCalmisInd(String calmisInd) {
		this.calmisInd = calmisInd;
	}

	/**
	 * @return the nodeId
	 */
	public Long getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId
	 *            the nodeId to set
	 */
	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the dimsUimsCde
	 */
	public String getDimsUimsCde() {
		return dimsUimsCde;
	}

	/**
	 * @param dimsUimsCde
	 *            the dimsUimsCde to set
	 */
	public void setDimsUimsCde(String dimsUimsCde) {
		this.dimsUimsCde = dimsUimsCde;
	}

	/**
	 * @return the ammoDepotInd
	 */
	public String getAmmoDepotInd() {
		return ammoDepotInd;
	}

	/**
	 * @param ammoDepotInd
	 *            the ammoDepotInd to set
	 */
	public void setAmmoDepotInd(String ammoDepotInd) {
		this.ammoDepotInd = ammoDepotInd;
	}

	/**
	 * @return the osisInd
	 */
	public String getOsisInd() {
		return osisInd;
	}

	/**
	 * @param osisInd
	 *            the osisInd to set
	 */
	public void setOsisInd(String osisInd) {
		this.osisInd = osisInd;
	}

	/**
	 * @return the paraJobCapabInd
	 */
	public String getParaJobCapabInd() {
		return paraJobCapabInd;
	}

	/**
	 * @param paraJobCapabInd
	 *            the paraJobCapabInd to set
	 */
	public void setParaJobCapabInd(String paraJobCapabInd) {
		this.paraJobCapabInd = paraJobCapabInd;
	}

	/**
	 * @return the paraSeaJumpLtdInd
	 */
	public String getParaSeaJumpLtdInd() {
		return paraSeaJumpLtdInd;
	}

	/**
	 * @param paraSeaJumpLtdInd
	 *            the paraSeaJumpLtdInd to set
	 */
	public void setParaSeaJumpLtdInd(String paraSeaJumpLtdInd) {
		this.paraSeaJumpLtdInd = paraSeaJumpLtdInd;
	}

	/**
	 * @return the paraPickListApplicInd
	 */
	public String getParaPickListApplicInd() {
		return paraPickListApplicInd;
	}

	/**
	 * @param paraPickListApplicInd
	 *            the paraPickListApplicInd to set
	 */
	public void setParaPickListApplicInd(String paraPickListApplicInd) {
		this.paraPickListApplicInd = paraPickListApplicInd;
	}

	/**
	 * @return the adminHq
	 */
	public Long getAdminHq() {
		return adminHq;
	}

	/**
	 * @param adminHq
	 *            the adminHq to set
	 */
	public void setAdminHq(Long adminHq) {
		this.adminHq = adminHq;
	}

	/**
	 * @return the externalDepInd
	 */
	public String getExternalDepInd() {
		return externalDepInd;
	}

	/**
	 * @param externalDepInd
	 *            the externalDepInd to set
	 */
	public void setExternalDepInd(String externalDepInd) {
		this.externalDepInd = externalDepInd;
	}

	/**
	 * @return the geogrCde
	 */
	public String getGeogrCde() {
		return geogrCde;
	}

	/**
	 * @param geogrCde
	 *            the geogrCde to set
	 */
	public void setGeogrCde(String geogrCde) {
		this.geogrCde = geogrCde;
	}

	/**
	 * @return the oliInd
	 */
	public String getOliInd() {
		return oliInd;
	}

	/**
	 * @param oliInd
	 *            the oliInd to set
	 */
	public void setOliInd(String oliInd) {
		this.oliInd = oliInd;
	}

	/**
	 * @return the electStkTkeInd
	 */
	public String getElectStkTkeInd() {
		return electStkTkeInd;
	}

	/**
	 * @param electStkTkeInd
	 *            the electStkTkeInd to set
	 */
	public void setElectStkTkeInd(String electStkTkeInd) {
		this.electStkTkeInd = electStkTkeInd;
	}

	/**
	 * @return the assetMigInd
	 */
	public String getAssetMigInd() {
		return assetMigInd;
	}

	/**
	 * @param assetMigInd
	 *            the assetMigInd to set
	 */
	public void setAssetMigInd(String assetMigInd) {
		this.assetMigInd = assetMigInd;
	}

}
