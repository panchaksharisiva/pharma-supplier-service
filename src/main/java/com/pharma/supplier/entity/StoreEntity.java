package com.pharma.supplier.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "store", schema = "supplier_schema")
public class StoreEntity {

	@Id
	@Column(name = "store_uid")
	private String storeUid;

	private String name;

	@Column(name = "store_code")
	private long storeCode;

	private String status;

	private String area;

	@Column(name = "gst_number")
	private String gstNumber;

	@JsonManagedReference("store-rating")
	@OneToMany(mappedBy = "storeEntity", fetch = FetchType.LAZY)
	private List<RatingEntity> ratingEntities;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_type_id")
	private StoreTypeEntity storeTypeEntity;

	@JsonBackReference("supplier-store")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_guid")
	private SupplierEntity supplierEntity;

	@OneToOne(mappedBy = "storeEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_uid")
	private AddressEntity addressEntity;

	@JsonManagedReference("store-contact")
	@OneToMany(mappedBy = "storeEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContactEntity> contactEntity;

	@JsonManagedReference("store-licence")
	@OneToMany(mappedBy = "storeEntity", fetch = FetchType.LAZY)
	private List<LicenceEntity> licenceEntities;

	public StoreEntity() {
	}

	public StoreEntity(String storeUid, String name, long storeCode, String status, String area, String gstNumber,
			List<RatingEntity> ratingEntities, StoreTypeEntity storeTypeEntity, SupplierEntity supplierEntity,
			AddressEntity addressEntity, List<ContactEntity> contactEntity,
			List<LicenceEntity> licenceEntities) {
		super();
		this.storeUid = storeUid;
		this.name = name;
		this.storeCode = storeCode;
		this.status = status;
		this.area = area;
		this.gstNumber = gstNumber;
		this.ratingEntities = ratingEntities;
		this.storeTypeEntity = storeTypeEntity;
		this.supplierEntity = supplierEntity;
		this.addressEntity = addressEntity;
		this.contactEntity = contactEntity;
		this.licenceEntities = licenceEntities;
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

	public List<RatingEntity> getRatingEntities() {
		return ratingEntities;
	}

	public void setRatingEntities(List<RatingEntity> ratingEntities) {
		this.ratingEntities = ratingEntities;
	}

	public StoreTypeEntity getStoreTypeEntity() {
		return storeTypeEntity;
	}

	public void setStoreTypeEntity(StoreTypeEntity storeTypeEntity) {
		this.storeTypeEntity = storeTypeEntity;
	}

	public SupplierEntity getSupplierEntity() {
		return supplierEntity;
	}

	public void setSupplierEntity(SupplierEntity supplierEntity) {
		this.supplierEntity = supplierEntity;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public List<ContactEntity> getContactEntity() {
		return contactEntity;
	}

	public void setContactEntity(List<ContactEntity> contactEntity) {
		this.contactEntity = contactEntity;
	}

	public List<LicenceEntity> getLicenceEntities() {
		return licenceEntities;
	}

	public void setLicenceEntities(List<LicenceEntity> licenceEntities) {
		this.licenceEntities = licenceEntities;
	}

}
