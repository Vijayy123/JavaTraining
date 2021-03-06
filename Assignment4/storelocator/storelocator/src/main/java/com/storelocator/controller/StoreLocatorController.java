package com.storelocator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.storelocator.entity.Store;
import com.storelocator.service.StoreLocatorService;

@RestController
public class StoreLocatorController {
	
	@Autowired
	private StoreLocatorService service;
	
	@GetMapping("/storeLocator/{pincode}")
	public List<Store> getStoreDetails(@PathVariable String pincode){
		
		return service.getStoreDetails(pincode);
	}

}
