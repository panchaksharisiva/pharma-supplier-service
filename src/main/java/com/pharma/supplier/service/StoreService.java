package com.pharma.supplier.service;

import java.util.List;

import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.SupplierDto;

public interface StoreService {

	public void createStore(StoreDto storeDto);

	public void updateStore(StoreDto storeDto);

	public void deleteStore(String storeId);

	public StoreDto findByStoreCode(long storeCode);

	public StoreDto findByStoreId(String storeId);

	List<SupplierDto> supplierAheadSearch(String query);

}
