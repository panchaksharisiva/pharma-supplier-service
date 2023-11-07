package com.pharma.supplier.dto;

public class ConnectStatusDto {
	private int connectStatusId;
	private String status;

	public ConnectStatusDto() {
	}

	public ConnectStatusDto(int connectStatusId, String status) {
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

	@Override
	public String toString() {
		return "ConnectStatusDto [connectStatusId=" + connectStatusId + ", status=" + status + "]";
	}

}
