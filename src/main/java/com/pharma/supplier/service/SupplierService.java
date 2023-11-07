package com.pharma.supplier.service;

import java.util.List;

import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.SupplierDto;

public interface SupplierService {

	public void createSupplier(SupplierDto supplierDto);

	public void updateSupplier(SupplierDto supplierDto);

	public void deleteBySupplierId(String supplierGuid);

	public SupplierDto findBySupplierGuid(String supplierGuid);

	public SupplierDto findBySupplierCode(long supplierCode);

	public List<StoreDto> storeAheadSearch(String searchQuery);

}
