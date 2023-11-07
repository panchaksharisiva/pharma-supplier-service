package com.pharma.supplier.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.supplier.dto.LicenceDto;

@RestController
@RequestMapping("/api/v1/licence")
public class LicenceController {

	@PostMapping("/create/{storeId}")
	public void createLicence(@RequestBody LicenceDto licenceDto, @PathVariable String storeId) {
		
	}
}
