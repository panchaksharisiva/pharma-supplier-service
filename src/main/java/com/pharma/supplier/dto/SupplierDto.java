package com.pharma.supplier.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;

public class SupplierDto {

	private String supplierGuid;

	private long supplierCode;

	@NotNull(message = "companyName should not be null")
	private String companyName;

	private String registrationCode;

	private String tanNumber;

	private String createdBy;

	private Date createdDate;

	private String updatedBy;

	private Date updatedDate;

	private String status;

	private String gstNumber;

	private String email;

	@NotNull(message = "username is mandatory")
	private String userName;

	@NotNull(message = "password should not be null")
	private String password;

	private LocalDate lastLoginDate;

	private List<StoreDto> storeDtos;

	public SupplierDto() {
	}

	public SupplierDto(String supplierGuid, long supplierCode,
			@NotNull(message = "companyName should not be null") String companyName, String registrationCode,
			String tanNumber, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String status,
			String gstNumber, String email, @NotNull(message = "username is mandatory") String userName,
			@NotNull(message = "password should not be null") String password, LocalDate lastLoginDate,
			List<StoreDto> storeDtos) {
		super();
		this.supplierGuid = supplierGuid;
		this.supplierCode = supplierCode;
		this.companyName = companyName;
		this.registrationCode = registrationCode;
		this.tanNumber = tanNumber;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.status = status;
		this.gstNumber = gstNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
		this.storeDtos = storeDtos;
	}

	public String getSupplierGuid() {
		return supplierGuid;
	}

	public void setSupplierGuid(String supplierGuid) {
		this.supplierGuid = supplierGuid;
	}

	public long getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(long supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationCode() {
		return registrationCode;
	}

	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}

	public String getTanNumber() {
		return tanNumber;
	}

	public void setTanNumber(String tanNumber) {
		this.tanNumber = tanNumber;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(LocalDate lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public List<StoreDto> getStoreDtos() {
		return storeDtos;
	}

	public void setStoreDtos(List<StoreDto> storeDtos) {
		this.storeDtos = storeDtos;
	}

	@Override
	public String toString() {
		return "SupplierDto [supplierGuid=" + supplierGuid + ", supplierCode=" + supplierCode + ", companyName="
				+ companyName + ", registrationCode=" + registrationCode + ", tanNumber=" + tanNumber + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", status=" + status + ", gstNumber=" + gstNumber + ", email=" + email + ", userName="
				+ userName + ", password=" + password + ", lastLoginDate=" + lastLoginDate + ", storeDtos=" + storeDtos
				+ "]";
	}

}
