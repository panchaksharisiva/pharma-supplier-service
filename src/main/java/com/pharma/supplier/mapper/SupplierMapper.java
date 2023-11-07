package com.pharma.supplier.mapper;

import java.util.UUID;

import org.mapstruct.Mapper;

import com.pharma.supplier.dto.AddressDto;
import com.pharma.supplier.dto.ContactDto;
import com.pharma.supplier.dto.LicenceDto;
import com.pharma.supplier.dto.RatingDto;
import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.StoreTypeDto;
import com.pharma.supplier.dto.SupplierDto;
import com.pharma.supplier.entity.AddressEntity;
import com.pharma.supplier.entity.ContactEntity;
import com.pharma.supplier.entity.LicenceEntity;
import com.pharma.supplier.entity.RatingEntity;
import com.pharma.supplier.entity.StoreEntity;
import com.pharma.supplier.entity.StoreTypeEntity;
import com.pharma.supplier.entity.SupplierEntity;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

	public SupplierEntity dtoToSupplierEntity(SupplierDto supplierDto);

	public StoreEntity dtoToStoreEntity(StoreDto storeDto);

	public AddressEntity dtoToAddressEntity(AddressDto addressDto);

	public ContactEntity dtoToContactEntity(ContactDto contactDto);

	public StoreTypeEntity dtoToStoreTypeEntity(StoreTypeDto storeTypeDto);

	public SupplierDto entityToSupplierDto(SupplierEntity supplierEntity);

	public StoreDto entityToStoreDto(StoreEntity storeEntity);

	public AddressDto entityToAddressDto(AddressEntity addressEntity);

	public ContactDto entityToContactDto(ContactEntity contactEntity);

	public StoreTypeDto EntityToStoreTypeDto(StoreTypeEntity storeTypeEntity);

	public LicenceDto entityToLicenceDto(LicenceEntity licenceEntity);

	public RatingDto entityToRatingDto(RatingEntity ratingEntity);

	default Long generateCodeIfNotExists(Long existingCode) {
		if (existingCode == null || existingCode == 0L) {
			long min = 100_000L;
			long max = 999_999L;
			return min + (long) (Math.random() * (max - min + 1));
		}
		return existingCode;
	}

	default String generateGuidIfNotExists(String existingGuid) {
		if (existingGuid == null) {
			return UUID.randomUUID().toString();
		}
		return existingGuid;
	}

	default UUID generateGuidIfNotExists(UUID existingGuid) {
		if (existingGuid == null) {
			return UUID.randomUUID();
		}
		return existingGuid;
	}

}
