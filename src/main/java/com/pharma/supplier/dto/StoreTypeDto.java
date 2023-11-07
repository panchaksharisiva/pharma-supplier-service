package com.pharma.supplier.dto;

public class StoreTypeDto {
	private int storeTypeId;
	private String description;

	public StoreTypeDto() {
	}

	public StoreTypeDto(int storeTypeId, String description) {
		this.storeTypeId = storeTypeId;
		this.description = description;
	}

	public int getStoreTypeId() {
		return storeTypeId;
	}

	public void setStoreTypeId(int storeTypeId) {
		this.storeTypeId = storeTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "StoreTypeDto [storeTypeId=" + storeTypeId + ", description=" + description + "]";
	}

}
