package com.pharma.supplier.dto;

import java.util.List;

public class StoreDto {
	private String storeUid;

	private String name;

	private long storeCode;

	private String status;

	private String contactName;

	private String area;

	private String gstNumber;

	private StoreTypeDto storeTypeDto;

	private AddressDto addressDto;

	private List<ContactDto> contactDtos;

	public StoreDto() {
	}

	public StoreDto(String storeUid, String name, long storeCode, String status, String contactName, String area,
			String gstNumber, StoreTypeDto storeTypeDto, AddressDto addressDto, List<ContactDto> contactDtos) {
		this.storeUid = storeUid;
		this.name = name;
		this.storeCode = storeCode;
		this.status = status;
		this.contactName = contactName;
		this.area = area;
		this.gstNumber = gstNumber;
		this.storeTypeDto = storeTypeDto;
		this.addressDto = addressDto;
		this.contactDtos = contactDtos;
	}

	public String getStoreUid() {
		return storeUid;
	}

	public void setStoreUid(String storeUid) {
		this.storeUid = storeUid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(long storeCode) {
		this.storeCode = storeCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public StoreTypeDto getStoreTypeDto() {
		return storeTypeDto;
	}

	public void setStoreTypeDto(StoreTypeDto storeTypeDto) {
		this.storeTypeDto = storeTypeDto;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public List<ContactDto> getContactDtos() {
		return contactDtos;
	}

	public void setContactDtos(List<ContactDto> contactDtos) {
		this.contactDtos = contactDtos;
	}

	@Override
	public String toString() {
		return "StoreDto [storeUid=" + storeUid + ", name=" + name + ", storeCode=" + storeCode + ", status=" + status
				+ ", contactName=" + contactName + ", area=" + area + ", gstNumber=" + gstNumber + ", storeTypeDto="
				+ storeTypeDto + ", addressDto=" + addressDto + ", contactDtos=" + contactDtos + "]";
	}

}
