package com.pharma.supplier.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "licence", schema = "supplier_schema")
public class LicenceEntity {

	@Id
	@Column(name = "licence_id")
	private String licenceId;
	private String description;

	@Column(name = "licence_code")
	private String licenceCode;

	@Column(name = "valid_from")
	private Date validFrom;

	@Column(name = "valid_to")
	private Date validTo;
	private String status;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "licence_type_id", insertable = false, updatable = false)
	private int licenceTypeId;
	/*
	 * @Column(name = "store_id", insertable = false, updatable = false) private
	 * String storeId;
	 */

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "licence_type_id")
	private LicenceTypeEntity licenceTypeEntity;

	@JsonBackReference("store-licence")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private StoreEntity storeEntity;

	public LicenceEntity() {
	}

	public LicenceEntity(String licenceId, String description, String licenceCode, Date validFrom, Date validTo,
			String status, Date createdDate, int licenceTypeId, LicenceTypeEntity licenceTypeEntity,
			StoreEntity storeEntity) {
		super();
		this.licenceId = licenceId;
		this.description = description;
		this.licenceCode = licenceCode;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.status = status;
		this.createdDate = createdDate;
		this.licenceTypeId = licenceTypeId;
		this.licenceTypeEntity = licenceTypeEntity;
		this.storeEntity = storeEntity;
	}

	public String getLicenceId() {
		return licenceId;
	}

	public void setLicenceId(String licenceId) {
		this.licenceId = licenceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLicenceCode() {
		return licenceCode;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getLicenceTypeId() {
		return licenceTypeId;
	}

	public void setLicenceTypeId(int licenceTypeId) {
		this.licenceTypeId = licenceTypeId;
	}

	public LicenceTypeEntity getLicenceTypeEntity() {
		return licenceTypeEntity;
	}

	public void setLicenceTypeEntity(LicenceTypeEntity licenceTypeEntity) {
		this.licenceTypeEntity = licenceTypeEntity;
	}

	public StoreEntity getStoreEntity() {
		return storeEntity;
	}

	public void setStoreEntity(StoreEntity storeEntity) {
		this.storeEntity = storeEntity;
	}

}
