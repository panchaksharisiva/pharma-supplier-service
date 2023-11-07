package com.pharma.supplier.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Connect_Status", schema = "supplier_schema")
public class ConnectStatusEntity {

	@Id
	@Column(name = "connect_status_id")
	private int connectStatusId;
	private String status;

	public ConnectStatusEntity() {
		super();
	}

	public ConnectStatusEntity(int connectStatusId, String status) {
		super();
		this.connectStatusId = connectStatusId;
		this.status = status;
	}

	public int getConnectStatusId() {
		return connectStatusId;
	}

	public void setConnectStatusId(int connectStatusId) {
		this.connectStatusId = connectStatusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
