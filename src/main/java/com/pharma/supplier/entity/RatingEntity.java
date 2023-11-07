package com.pharma.supplier.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rating", schema = "supplier_schema")
public class RatingEntity {

	@Id
	@Column(name = "rating_id")
	private long ratingId;
	private Double rating;

	@Column(name = "last_updated_date")
	private Date lastUpdateDate;
	private int sequence;

	@Column(name = "rating_sum")
	private Double ratingsum;

	@JsonBackReference("store-rating")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private StoreEntity storeEntity;

	public RatingEntity() {
		super();
	}

	public RatingEntity(long ratingId, Double rating, Date lastUpdateDate, int sequence, Double ratingsum,
			StoreEntity storeEntity) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.lastUpdateDate = lastUpdateDate;
		this.sequence = sequence;
		this.ratingsum = ratingsum;
		this.storeEntity = storeEntity;
	}

	public long getRatingId() {
		return ratingId;
	}

	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public Double getRatingsum() {
		return ratingsum;
	}

	public void setRatingsum(Double ratingsum) {
		this.ratingsum = ratingsum;
	}

	public StoreEntity getStoreEntity() {
		return storeEntity;
	}

	public void setStoreEntity(StoreEntity storeEntity) {
		this.storeEntity = storeEntity;
	}

}