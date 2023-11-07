package com.pharma.supplier.dto;

import java.util.Date;

public class LicenceDto {
	private String licenceId;
	private String description;

	private String licenceCode;

	private Date validFrom;

	private Date validTo;
	private String status;

	private Date createdDate;

	private int licenceTypeId;

	private String storeId;

	private LicenceTypeDto licenceTypeDto;

	private StoreDto storeDto;

	private SupplierDto supplierDto;

	public LicenceDto() {
	}

	public LicenceDto(String licenceId, String description, String licenceCode, Date validFrom, Date validTo,
			String status, Date createdDate, int licenceTypeId, String storeId, LicenceTypeDto licenceTypeDto,
			StoreDto storeDto, SupplierDto supplierDto) {
		super();
		this.licenceId = licenceId;
		this.description = description;
		this.licenceCode = licenceCode;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.status = status;
		this.createdDate = createdDate;
		this.licenceTypeId = licenceTypeId;
		this.storeId = storeId;
		this.licenceTypeDto = licenceTypeDto;
		this.storeDto = storeDto;
		this.supplierDto = supplierDto;
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

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public LicenceTypeDto getLicenceTypeDto() {
		return licenceTypeDto;
	}

	public void setLicenceTypeDto(LicenceTypeDto licenceTypeDto) {
		this.licenceTypeDto = licenceTypeDto;
	}

	public StoreDto getStoreDto() {
		return storeDto;
	}

	public void setStoreDto(StoreDto storeDto) {
		this.storeDto = storeDto;
	}

	public SupplierDto getSupplierDto() {
		return supplierDto;
	}

	public void setSupplierDto(SupplierDto supplierDto) {
		this.supplierDto = supplierDto;
	}

	@Override
	public String toString() {
		return "LicenceDto [licenceId=" + licenceId + ", description=" + description + ", licenceCode=" + licenceCode
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", status=" + status + ", createdDate="
				+ createdDate + ", licenceTypeId=" + licenceTypeId + ", storeId=" + storeId + ", licenceTypeDto="
				+ licenceTypeDto + "]";
	}

}
