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
import com.pharma.supplier.serviceimpl.StoreServiceImpl;

@RestController
@RequestMapping("/api/v1/store")
public class StoreController {

	private StoreServiceImpl storeServiceImpl;

	public StoreController(StoreServiceImpl storeServiceImpl) {
		this.storeServiceImpl = storeServiceImpl;
	}

	@PostMapping("/create")
	public void createStore(@RequestBody StoreDto storeDto) {
		storeServiceImpl.createStore(storeDto);
	}

	@PutMapping("/update")
	public void updateStore(@RequestBody StoreDto storeDto) {
		storeServiceImpl.updateStore(storeDto);
	}

	@DeleteMapping("/delete/{storeId}")
	public void deleteStore(@PathVariable("storeId") String storeId) {
		storeServiceImpl.deleteStore(storeId);
	}

	@GetMapping("/findByCode/{storeCode}")
	public StoreDto findByStoreCode(@PathVariable long storeCode) {
		return storeServiceImpl.findByStoreCode(storeCode);
	}

	@GetMapping("/findById/{storeId}")
	public StoreDto findByStoreId(@PathVariable String storeId) {
		return storeServiceImpl.findByStoreId(storeId);
	}

	@GetMapping("/storeAheadSearch/{query}")
	public List<SupplierDto> supplierAheadSearch(@PathVariable("query") String query) {
		return storeServiceImpl.supplierAheadSearch(query);
	}
}
