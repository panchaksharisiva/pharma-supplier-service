package com.pharma.supplier.dto;

import java.util.UUID;

public class ContactDto {
	private UUID contactUid;
	private String contactType;
	private String number;

	public ContactDto() {
	}

	public ContactDto(UUID contactUid, String contactType, String number) {
		this.contactUid = contactUid;
		this.contactType = contactType;
		this.number = number;
	}

	public UUID getContactUid() {
		return contactUid;
	}

	public void setContactUid(UUID contactUid) {
		this.contactUid = contactUid;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ContactDto [contactUid=" + contactUid + ", contactType=" + contactType + ", number=" + number + "]";
	}

}
