package com.pharma.supplier.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact", schema = "supplier_schema")
public class ContactEntity {

	@Id
	@Column(name = "contact_uid")
	private UUID contactUid;

	@Column(name = "contact_type")
	private String contactType;
	private String number;

	@JsonBackReference("store-contact")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private StoreEntity storeEntity;

	public ContactEntity() {
		super();
	}

	public ContactEntity(UUID contactUid, String contactType, String number, StoreEntity storeEntity) {
		super();
		this.contactUid = contactUid;
		this.contactType = contactType;
		this.number = number;
		this.storeEntity = storeEntity;
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

	public StoreEntity getStoreEntity() {
		return storeEntity;
	}

	public void setStoreEntity(StoreEntity storeEntity) {
		this.storeEntity = storeEntity;
	}

}
