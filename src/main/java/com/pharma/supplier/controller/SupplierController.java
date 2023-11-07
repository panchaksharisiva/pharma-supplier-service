package com.pharma.supplier.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.supplier.dto.StoreDto;
import com.pharma.supplier.dto.SupplierDto;
import com.pharma.supplier.serviceimpl.SupplierServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {

	private SupplierServiceImpl supplierServiceImpl;

	public SupplierController(SupplierServiceImpl supplierServiceImpl) {
		this.supplierServiceImpl = supplierServiceImpl;
	}

	@PostMapping("/create")
	public void createSupplier(@Valid  @RequestBody SupplierDto supplierDto) {
		supplierServiceImpl.createSupplier(supplierDto);
	}

	@PutMapping("/update")
	public void updateSupplier(@Valid  @RequestBody SupplierDto supplierDto) {
		supplierServiceImpl.updateSupplier(supplierDto);
	}

	@DeleteMapping("/delete/{supplierGuid}")
	public void deleteBySupplierId(@PathVariable("supplierGuid") String supplierGuid) {
		supplierServiceImpl.deleteBySupplierId(supplierGuid);
	}

	@GetMapping("/findByGuid/{supplierGuid}")
	public SupplierDto findBySupplierGuid(@PathVariable String supplierGuid) {
		return supplierServiceImpl.findBySupplierGuid(supplierGuid);
	}

	@GetMapping("/findByCode/{supplierCode}")
	public SupplierDto findBySupplierCode(@PathVariable("supplierCode") long supplierCode) {
		return supplierServiceImpl.findBySupplierCode(supplierCode);
	}

	@GetMapping("/storeAheadSearch/{searchQuery}")
	public List<StoreDto> storeAheadSearch(@PathVariable("searchQuery") String searchQuery) {
		return supplierServiceImpl.storeAheadSearch(searchQuery);
	}
}
