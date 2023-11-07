package com.pharma.supplier.mapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.pharma.supplier.dto.AddressDto;
import com.pharma.supplier.dto.ContactDto;
import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.StoreTypeDto;
import com.pharma.supplier.dto.SupplierDto;
import com.pharma.supplier.entity.AddressEntity;
import com.pharma.supplier.entity.ContactEntity;
import com.pharma.supplier.entity.StoreEntity;
import com.pharma.supplier.entity.StoreTypeEntity;
import com.pharma.supplier.entity.SupplierEntity;

@Component
public class SupplierCommandMapper {
	SupplierMapper supplierMapper;

	public SupplierCommandMapper(SupplierMapper supplierMapper) {
		this.supplierMapper = supplierMapper;
	}

	public SupplierEntity mapToSupplierEntity(SupplierDto supplierDto) {

		if (supplierDto.getSupplierGuid() == null || supplierDto.getSupplierGuid().length() == 0) {
			supplierDto.setSupplierGuid(UUID.randomUUID().toString());
			supplierDto.setSupplierCode(supplierMapper.generateCodeIfNotExists(null));
		}
		var supplierEntity = supplierMapper.dtoToSupplierEntity(supplierDto);
		supplierEntity.setStoreEntities(mapToStoreEntities(supplierDto.getStoreDtos(), supplierEntity));
		return supplierEntity;
	}

	public List<StoreEntity> mapToStoreEntities(List<StoreDto> storeDtos, SupplierEntity supplierEntity) {
		return storeDtos.stream().map(storeDto -> mapToStoreEntity(storeDto, supplierEntity))
				.collect(Collectors.toList());
	}

	public StoreEntity mapToStoreEntity(StoreDto storeDto, SupplierEntity supplierEntity) {

		if (storeDto.getStoreUid() == null || storeDto.getStoreUid().toString().length() == 0) {
			storeDto.setStoreUid(UUID.randomUUID().toString());
			storeDto.setStoreCode(supplierMapper.generateCodeIfNotExists(null));
		}

		var storeEntity = supplierMapper.dtoToStoreEntity(storeDto);
		storeEntity.setSupplierEntity(supplierEntity);
		storeEntity.setAddressEntity(mapToAddressEntity(storeDto.getAddressDto(), storeEntity));
		storeEntity.setContactEntity(mapToContactEntities(storeDto.getContactDtos(), storeEntity));
		storeEntity.setStoreTypeEntity(mapToStoreTypeEntity(storeDto.getStoreTypeDto()));
		// storeEntity.setLicenceEntities(mapToLicenceEntities(storeDto.getl));
		return storeEntity;
	}

	public AddressEntity mapToAddressEntity(AddressDto addressDto, StoreEntity storeEntity) {
		if (addressDto.getAddressUid() == null) {
			addressDto.setAddressUid(UUID.randomUUID());
		}

		var addressEntity = supplierMapper.dtoToAddressEntity(addressDto);
		addressEntity.setStoreEntity(storeEntity);
		return addressEntity;
	}

	public List<ContactEntity> mapToContactEntities(List<ContactDto> contactDtos, StoreEntity storeEntity) {
		return contactDtos.stream().map(contactDto -> mapToContactEntity(contactDto, storeEntity))
				.collect(Collectors.toList());
	}

	public ContactEntity mapToContactEntity(ContactDto contactDto, StoreEntity storeEntity) {
		if (contactDto.getContactUid() == null) {
			contactDto.setContactUid(UUID.randomUUID());
		}

		var contactEntity = supplierMapper.dtoToContactEntity(contactDto);
		contactEntity.setStoreEntity(storeEntity);
		return contactEntity;
	}

	public StoreTypeEntity mapToStoreTypeEntity(StoreTypeDto storeTypeDto) {
		return supplierMapper.dtoToStoreTypeEntity(storeTypeDto);
	}

	public List<SupplierDto> mapToSupplierDtos(List<SupplierEntity> supplierEntites) {
		return supplierEntites.stream().map(supplierEntity -> mapToSupplierDto(supplierEntity))
				.collect(Collectors.toList());
	}
	public SupplierDto mapToSupplierDto(SupplierEntity supplierEntity) {
		var supplierDto = supplierMapper.entityToSupplierDto(supplierEntity);
		supplierDto.setStoreDtos(mapToStoreDtos(supplierEntity.getStoreEntities()));
		return supplierDto;
	}	

	public List<StoreDto> mapToStoreDtos(List<StoreEntity> storeEntities) {
		return storeEntities.stream().map(storeEntity -> mapToStoreDto(storeEntity))
				.collect(Collectors.toList());
	}

	public StoreDto mapToStoreDto(StoreEntity storeEntity) {
		var storeDto = supplierMapper.entityToStoreDto(storeEntity);
		storeDto.setAddressDto(mapToAddressDto(storeEntity.getAddressEntity()));
		storeDto.setContactDtos(mapToContactDtos(storeEntity.getContactEntity()));
		storeDto.setStoreTypeDto(mapToStoreTypeDto(storeEntity.getStoreTypeEntity()));
		return storeDto;
	}

	public AddressDto mapToAddressDto(AddressEntity addressEntity) {
		var addressDto = supplierMapper.entityToAddressDto(addressEntity);
		return addressDto;
	}

	public ContactDto mapToContactDto(ContactEntity contactEntity) {
		var contactDto = supplierMapper.entityToContactDto(contactEntity);
		return contactDto;
	}

	public List<ContactDto> mapToContactDtos(List<ContactEntity> contactEntities) {
		return contactEntities.stream().map(contactEntity -> mapToContactDto(contactEntity))
				.collect(Collectors.toList());
	}

	public StoreTypeDto mapToStoreTypeDto(StoreTypeEntity storeTypeEntity) {
		var StoreTypeDto = supplierMapper.EntityToStoreTypeDto(storeTypeEntity);
		return StoreTypeDto;
	}
}
