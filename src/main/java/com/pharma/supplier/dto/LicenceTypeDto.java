package com.pharma.supplier.dto;

public class LicenceTypeDto {
	private int licenceTypeId;
	private String description;

	public LicenceTypeDto() {
	}

	public LicenceTypeDto(int licenceTypeId, String description) {
		super();
		this.licenceTypeId = licenceTypeId;
		this.description = description;
	}

	public int getLicenceTypeId() {
		return licenceTypeId;
	}

	public void setLicenceTypeId(int licenceTypeId) {
		this.licenceTypeId = licenceTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LicenceTypeDto [licenceTypeId=" + licenceTypeId + ", description=" + description + "]";
	}

}
