package com.pharma.supplier.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier", schema = "supplier_schema")
public class SupplierEntity {

	@Id
	@Column(name = "supplier_guid")
	private String supplierGuid;

	@Column(name = "supplier_code")
	private long supplierCode;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "registration_code")
	private String registrationCode;

	@Column(name = "tan_number")
	private String tanNumber;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "gst_number")
	private String gstNumber;

	private String status;

	private String email;

	@Column(name = "user_name")
	private String userName;
	private String password;

	@Column(name = "last_login_date")
	private LocalDate lastLoginDate;

	@JsonManagedReference("supplier-store")
	@OneToMany(mappedBy = "supplierEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StoreEntity> storeEntities;

	public SupplierEntity() {
	}

	public SupplierEntity(String supplierGuid, long supplierCode, String companyName, String registrationCode,
			String tanNumber, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String gstNumber,
			String status, String email, String userName, String password, LocalDate lastLoginDate,
			List<StoreEntity> storeEntities) {
		this.supplierGuid = supplierGuid;
		this.supplierCode = supplierCode;
		this.companyName = companyName;
		this.registrationCode = registrationCode;
		this.tanNumber = tanNumber;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.gstNumber = gstNumber;
		this.status = status;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
		this.storeEntities = storeEntities;
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

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public List<StoreEntity> getStoreEntities() {
		return storeEntities;
	}

	public void setStoreEntities(List<StoreEntity> storeEntities) {
		this.storeEntities = storeEntities;
	}

}
