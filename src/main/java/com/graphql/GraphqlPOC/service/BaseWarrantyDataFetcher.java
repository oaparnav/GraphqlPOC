package com.graphql.GraphqlPOC.service;

import org.springframework.stereotype.Component;

import com.graphql.GraphqlPOC.model.WarrantyCoverageLookupResponse;

@Component
public class BaseWarrantyDataFetcher {

	public WarrantyCoverageLookupResponse get(String vin, String country, String language) {
		WarrantyCoverageLookupResponse response = WarrantyCoverageLookupResponse.builder()
				.url("https://dummy.com")
				.warrantyEndDate("22/10/2020")
				.build();
		return response;
	}

}
