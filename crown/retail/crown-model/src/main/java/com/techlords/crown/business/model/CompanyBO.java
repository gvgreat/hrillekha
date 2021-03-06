package com.techlords.crown.business.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.techlords.crown.business.model.enums.StatusBO;
import com.techlords.infra.AppModel;

@SuppressWarnings("serial")
public class CompanyBO extends AppModel {

	@NotEmpty(message = "Company Name cannot be empty")
	@Size(min = 2, max = 50, message = "Company Name shall be from 2 to 50 chars")
	private String companyName;
	@NotEmpty(message = "Description cannot be empty")
	@Size(min = 2, max = 25, message = "Description shall be from 2 to 25 chars")
	private String description;
	@NotEmpty(message = "Address cannot be empty")
	@Size(min = 5, max = 2500)
	private String address;
	@NotEmpty(message = "Phone Number cannot be empty")
	@Size(min = 5, max = 25, message = "Phone Number shall be from 5 to 25 chars")
	// @Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message
	// = "Invalid phone/fax format, should be as xxx-xxx-xxxx")
	// if the field contains phone or fax number consider using this annotation
	// to enforce field validation
	private String phone;
	private String createdby;

	@NotEmpty(message = "TIN cannot be empty")
	@Size(min = 5, max = 25, message = "TIN shall be from 5 to 25 chars")
	private String tin;

	@Min(value = 1, message = "Select a company type")
	private int companyType;
	@Min(value = 1, message = "Select a location")
	private int location;
	private int statusID;

	private CompanyTypeBO companyTypeBO;
	private LocationBO locationBO;
	private CrownUserBO crownUserBO;
	private StatusBO status;

	/**
	 * @return the companyName
	 */
	public final String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public final void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the createdby
	 */
	public final String getCreatedby() {
		return createdby;
	}

	/**
	 * @param createdby
	 *            the createdby to set
	 */
	public final void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	/**
	 * @return the tin
	 */
	public final String getTin() {
		return tin;
	}

	/**
	 * @param tin
	 *            the tin to set
	 */
	public final void setTin(String tin) {
		this.tin = tin;
	}

	/**
	 * @return the companyTypeBO
	 */
	public final CompanyTypeBO getCompanyTypeBO() {
		return companyTypeBO;
	}

	/**
	 * @param companyTypeBO
	 *            the companyTypeBO to set
	 */
	public final void setCompanyTypeBO(CompanyTypeBO companyTypeBO) {
		this.companyTypeBO = companyTypeBO;
	}

	/**
	 * @return the locationBO
	 */
	public final LocationBO getLocationBO() {
		return locationBO;
	}

	/**
	 * @param locationBO
	 *            the locationBO to set
	 */
	public final void setLocationBO(LocationBO locationBO) {
		this.locationBO = locationBO;
	}

	/**
	 * @return the crownUserBO
	 */
	public final CrownUserBO getCrownUserBO() {
		return crownUserBO;
	}

	/**
	 * @param crownUserBO
	 *            the crownUserBO to set
	 */
	public final void setCrownUserBO(CrownUserBO crownUserBO) {
		this.crownUserBO = crownUserBO;
	}

	/**
	 * @return the status
	 */
	public final StatusBO getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public final void setStatus(StatusBO status) {
		this.status = status;
	}

	/**
	 * @return the companyType
	 */
	public final int getCompanyType() {
		return companyType;
	}

	/**
	 * @param companyType
	 *            the companyType to set
	 */
	public final void setCompanyType(int companyType) {
		this.companyType = companyType;
	}

	/**
	 * @return the location
	 */
	public final int getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public final void setLocation(int location) {
		this.location = location;
	}

	/**
	 * @return the statusID
	 */
	public final int getStatusID() {
		return statusID;
	}

	/**
	 * @param statusID
	 *            the statusID to set
	 */
	public final void setStatusID(int statusID) {
		this.statusID = statusID;
	}
}