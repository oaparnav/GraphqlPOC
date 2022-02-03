package com.graphql.GraphqlPOC.service;

import org.springframework.stereotype.Component;

import com.graphql.GraphqlPOC.model.RequestStatus;
import com.graphql.GraphqlPOC.model.WarrantyCoverage;

@Component
public class APWarrantyDataFetcher {

	public WarrantyCoverage get(String vin) {
		
		WarrantyCoverage response = WarrantyCoverage.builder().extendedServicePlan("Mock plan")
															  .warrantyStartDate("10/08/2020")
															  .warrantyEndDate("19/8/2020")
															  .warrantyEndMileage(10L)
															  .requestStatus(RequestStatus.CURRENT)
															  .build();
															 
		return response;
	}

}
