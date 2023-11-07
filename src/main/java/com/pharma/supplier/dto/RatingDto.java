package com.pharma.supplier.dto;

import java.util.Date;

public class RatingDto {
	private long ratingId;
	private Double rating;

	private Date lastUpdateDate;
	private int sequence;

	private Double ratingsum;

	private StoreDto storeDto;

	public RatingDto() {
	}

	public RatingDto(long ratingId, Double rating, Date lastUpdateDate, int sequence, Double ratingsum,
			StoreDto storeDto) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.lastUpdateDate = lastUpdateDate;
		this.sequence = sequence;
		this.ratingsum = ratingsum;
		this.storeDto = storeDto;
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

	public StoreDto getStoreModel() {
		return storeDto;
	}

	public void setStoreModel(StoreDto storeDto) {
		this.storeDto = storeDto;
	}

	@Override
	public String toString() {
		return "RatingDto [ratingId=" + ratingId + ", rating=" + rating + ", lastUpdateDate=" + lastUpdateDate
				+ ", sequence=" + sequence + ", ratingsum=" + ratingsum + ", storeDto=" + storeDto + "]";
	}

}
