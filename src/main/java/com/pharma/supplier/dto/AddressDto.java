package com.pharma.supplier.dto;

import java.util.UUID;

public class AddressDto {
	private UUID addressUid;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	private String city;

	private String state;

	private long postalCode;

	public AddressDto() {
	}

	public AddressDto(UUID addressUid, String addressLine1, String addressLine2, String addressLine3, String city,
			String state, long postalCode) {
		this.addressUid = addressUid;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public UUID getAddressUid() {
		return addressUid;
	}

	public void setAddressUid(UUID addressUid) {
		this.addressUid = addressUid;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressDto [addressUid=" + addressUid + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", addressLine3=" + addressLine3 + ", city=" + city + ", state=" + state
				+ ", postalCode=" + postalCode + "]";
	}

}
