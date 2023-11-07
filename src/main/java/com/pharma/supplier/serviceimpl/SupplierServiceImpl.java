package com.pharma.supplier.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.SupplierDto;
import com.pharma.supplier.entity.SupplierEntity;
import com.pharma.supplier.exception.SupplierNotFound;
import com.pharma.supplier.mapper.SupplierCommandMapper;
import com.pharma.supplier.repository.SupplierRepository;
import com.pharma.supplier.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

	private SupplierRepository supplierRepository;

	private SupplierCommandMapper supplierCommandMapper;

	public SupplierServiceImpl(SupplierRepository supplierRepository, SupplierCommandMapper supplierCommandMapper) {
		this.supplierRepository = supplierRepository;
		this.supplierCommandMapper = supplierCommandMapper;
	}

	@Override
	public void createSupplier(SupplierDto supplierDto) {
		supplierRepository.save(supplierCommandMapper.mapToSupplierEntity(supplierDto));
	}

	@Override
	public void updateSupplier(SupplierDto supplierDto) {
		supplierRepository.save(supplierCommandMapper.mapToSupplierEntity(supplierDto));
	}

	@Override
	public void deleteBySupplierId(String supplierGuid) {
		Optional<SupplierEntity> supplierDtoOptional = supplierRepository.findById(supplierGuid);
		if (!supplierDtoOptional.isEmpty()) {
			var supplierEntity = supplierDtoOptional.get();
			supplierRepository.delete(supplierEntity);
		} else {
			throw new SupplierNotFound("Supplier not found for giver supplierGuid--->" + supplierGuid);
		}
	}

	@Override
	public SupplierDto findBySupplierGuid(String supplierGuid) {
		Optional<SupplierEntity> supplierDtoOptional = supplierRepository.findById(supplierGuid);
		if (!supplierDtoOptional.isEmpty()) {
			var supplierEntity = supplierDtoOptional.get();
			return supplierCommandMapper.mapToSupplierDto(supplierEntity);
		} else {
			throw new SupplierNotFound("Supplier not found for given supplierGuid --->" + supplierGuid);
		}
	}

	@Override
	public SupplierDto findBySupplierCode(long supplierCode) {
		SupplierEntity existingEntity = supplierRepository.findBySupplierCode(supplierCode).orElseThrow(
				() -> new SupplierNotFound("supplier not found for given supplierCode --->" + supplierCode));
		return supplierCommandMapper.mapToSupplierDto(existingEntity);
	}

	@Override
	public List<StoreDto> storeAheadSearch(String searchQuery) {
		return supplierCommandMapper.mapToStoreDtos(supplierRepository.storeAheadSearch(searchQuery));
	}

}
