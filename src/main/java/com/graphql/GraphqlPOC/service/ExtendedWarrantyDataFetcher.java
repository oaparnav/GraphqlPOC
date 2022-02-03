package com.graphql.GraphqlPOC.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.graphql.GraphqlPOC.model.ExtendedWarrantyCoverageResponse;

@Component
public class ExtendedWarrantyDataFetcher {

	public ExtendedWarrantyCoverageResponse get(String vin) {
		
		ExtendedWarrantyCoverageResponse response = ExtendedWarrantyCoverageResponse.builder()
																			   .contractExpirationDate(null)
																			   .contractExpirationDistanceMeasure(BigDecimal.TEN)
																			   .contractType("This is mocked contract for vin "+ vin)
																			   .termPeriodMonths("0")
																			   .mileageUnit("0")
																			   .build();
		return response;
	}

}