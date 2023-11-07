package com.pharma.supplier.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier_retailer", schema = "supplier_schema")
public class SupplierRetailerEntity {

	@Id
	@Column(name = "connect_retailer_id")
	private String contactRetailerId;

	@Column(name = "tp_retailer_code")
	private String tpRetailerCode;

	@Column(name = "retailer_guid")
	private String retailerguid;

	@Column(name = "connect_status_id")
	private int connectStatusId;

	@Column(name = "store_id",insertable=false, updatable=false)
	private String storeId;
	
	private int priority;

	@Column(name = "tp_supplier_code")
	private String tpSupplierCode;

	@Column(name = "requested_by")
	private String requestedBy;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "connect_status_id",insertable=false, updatable=false)
	private ConnectStatusEntity connectStatusEntity;

	public SupplierRetailerEntity() {
		super();
	}

	public SupplierRetailerEntity(String contactRetailerId, String tpRetailerCode, String retailerguid,
			int connectStatusId, String storeId, int priority, String tpSupplierCode, String requestedBy,
			ConnectStatusEntity connectStatusEntity) {
		super();
		this.contactRetailerId = contactRetailerId;
		this.tpRetailerCode = tpRetailerCode;
		this.retailerguid = retailerguid;
		this.connectStatusId = connectStatusId;
		this.storeId = storeId;
		this.priority = priority;
		this.tpSupplierCode = tpSupplierCode;
		this.requestedBy = requestedBy;
		this.connectStatusEntity = connectStatusEntity;
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

	public ConnectStatusEntity getConnectStatusEntity() {
		return connectStatusEntity;
	}

	public void setConnectStatusEntity(ConnectStatusEntity connectStatusEntity) {
		this.connectStatusEntity = connectStatusEntity;
	}

}
