package com.storelocator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storelocator.entity.Store;
import com.storelocator.repository.StoreLocatorRepository;

@Service
public class StoreLocatorService {
	@Autowired
	private StoreLocatorRepository repo;

	public List<Store> getStoreDetails(String pincode) {
		
		List<Store> storeDetails = repo.findAll();
		List<Store> storeDetailsrelatedtoPincode = new ArrayList<>();
		for(Store store:storeDetails) {
			if(store.getPincode().equals(pincode)) {
				storeDetailsrelatedtoPincode.add(store);
			}
		}
		return storeDetailsrelatedtoPincode;
		
	}

}
