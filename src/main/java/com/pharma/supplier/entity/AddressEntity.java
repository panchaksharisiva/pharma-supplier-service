package com.pharma.supplier.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address", schema = "supplier_schema")
public class AddressEntity {

	@Id
	@Column(name = "address_uid")
	private UUID addressUid;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "address_line3")
	private String addressLine3;

	private String city;
	private String state;

	@Column(name = "postal_code")
	private long postalCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private StoreEntity storeEntity;

	public AddressEntity() {
	}

	public AddressEntity(UUID addressUid, String addressLine1, String addressLine2, String addressLine3, String city,
			String state, long postalCode, StoreEntity storeEntity) {
		this.addressUid = addressUid;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.storeEntity = storeEntity;
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

	public StoreEntity getStoreEntity() {
		return storeEntity;
	}

	public void setStoreEntity(StoreEntity storeEntity) {
		this.storeEntity = storeEntity;
	}

}
