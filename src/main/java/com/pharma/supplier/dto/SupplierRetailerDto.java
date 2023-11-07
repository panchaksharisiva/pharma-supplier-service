package com.pharma.supplier.dto;

public class SupplierRetailerDto {

	private String contactRetailerId;

	private String tpRetailerCode;

	private String retailerguid;

	private int connectStatusId;

	private String storeId;
	private int priority;

	private String tpSupplierCode;

	private String requestedBy;

	private ConnectStatusDto connectStatusDto;

	public SupplierRetailerDto() {
	}

	public SupplierRetailerDto(String contactRetailerId, String tpRetailerCode, String retailerguid,
			int connectStatusId, String storeId, int priority, String tpSupplierCode, String requestedBy,
			ConnectStatusDto connectStatusDto) {
		super();
		this.contactRetailerId = contactRetailerId;
		this.tpRetailerCode = tpRetailerCode;
		this.retailerguid = retailerguid;
		this.connectStatusId = connectStatusId;
		this.storeId = storeId;
		this.priority = priority;
		this.tpSupplierCode = tpSupplierCode;
		this.requestedBy = requestedBy;
		this.connectStatusDto = connectStatusDto;
	}

	public String getContactRetailerId() {
		return contactRetailerId;
	}

	public void setContactRetailerId(String contactRetailerId) {
		this.contactRetailerId = contactRetailerId;
	}

	public String getTpRetailerCode() {
		return tpRetailerCode;
	}

	public void setTpRetailerCode(String tpRetailerCode) {
		this.tpRetailerCode = tpRetailerCode;
	}

	public String getRetailerguid() {
		return retailerguid;
	}

	public void setRetailerguid(String retailerguid) {
		this.retailerguid = retailerguid;
	}

	public int getConnectStatusId() {
		return connectStatusId;
	}

	public void setConnectStatusId(int connectStatusId) {
		this.connectStatusId = connectStatusId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTpSupplierCode() {
		return tpSupplierCode;
	}

	public void setTpSupplierCode(String tpSupplierCode) {
		this.tpSupplierCode = tpSupplierCode;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public ConnectStatusDto getConnectStatusDto() {
		return connectStatusDto;
	}

	public void setConnectStatusModel(ConnectStatusDto connectStatusDto) {
		this.connectStatusDto = connectStatusDto;
	}

	@Override
	public String toString() {
		return "SupplierRetailerDto [contactRetailerId=" + contactRetailerId + ", tpRetailerCode=" + tpRetailerCode
				+ ", retailerguid=" + retailerguid + ", connectStatusId=" + connectStatusId + ", storeId=" + storeId
				+ ", priority=" + priority + ", tpSupplierCode=" + tpSupplierCode + ", requestedBy=" + requestedBy
				+ ", connectStatus=" + connectStatusDto + "]";
	}

}