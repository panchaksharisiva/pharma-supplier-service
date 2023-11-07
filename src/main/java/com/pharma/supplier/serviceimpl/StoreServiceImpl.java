package com.pharma.supplier.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.SupplierDto;
import com.pharma.supplier.entity.StoreEntity;
import com.pharma.supplier.mapper.SupplierCommandMapper;
import com.pharma.supplier.repository.StoreRepository;
import com.pharma.supplier.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	private StoreRepository storeRepository;

	private SupplierCommandMapper supplierCommandMapper;

	public StoreServiceImpl(StoreRepository storeRepository, SupplierCommandMapper supplierCommandMapper) {
		this.storeRepository = storeRepository;
		this.supplierCommandMapper = supplierCommandMapper;
	}

	@Override
	public void createStore(StoreDto storeDto) {
		storeRepository.save(supplierCommandMapper.mapToStoreEntity(storeDto, null));
	}

	@Override
	public void updateStore(StoreDto storeDto) {
		storeRepository.save(supplierCommandMapper.mapToStoreEntity(storeDto, null));
	}

	@Override
	public void deleteStore(String storeId) {
		storeRepository.deleteById(storeId);
	}

	@Override
	public StoreDto findByStoreCode(long storeCode) {
		Optional<StoreEntity> storeOptionalEntity = storeRepository.findByStoreCode(storeCode);
		if (storeOptionalEntity.isPresent()) {
			return supplierCommandMapper.mapToStoreDto(storeOptionalEntity.get());
		} else {
			throw new RuntimeException("Store Not found with the given store Code" + storeCode);
		}
	}

	@Override
	public StoreDto findByStoreId(String storeId) {
		Optional<StoreEntity> storeDtoOptional = storeRepository.findById(storeId);
		if (!storeDtoOptional.isEmpty()) {
			var storeEntity = storeDtoOptional.get();
			return supplierCommandMapper.mapToStoreDto(storeEntity);
		} else {
			throw new RuntimeException("Store not found for giver storeId--->" + storeId);
		}
	}

	@Override
	public List<SupplierDto> supplierAheadSearch(String query) {
		return supplierCommandMapper.mapToSupplierDtos(storeRepository.supplierAheadSearch(query));

	}
}
