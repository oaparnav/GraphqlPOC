package com.graphql.GraphqlPOC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.graphql.GraphqlPOC.model.Contract;
import com.graphql.GraphqlPOC.model.ServiceStatus;
import com.graphql.GraphqlPOC.model.WarrantyCoverageResponse;

@Component
public class MEandAFWarrantyDataFetcher {

	public WarrantyCoverageResponse get(String vin, String country) {
		Contract contracts = Contract.builder()
				 .contractBusinessStatus("1")
				 .contractExpirationDate("22/8/2020")
				 .contractExpirationDistanceMeasure("0.00")
				 .contractProductName("CAR")
				 .build();
List<Contract> contractsList = new ArrayList<Contract>();
contractsList.add(contracts);
ServiceStatus serviceStatus = ServiceStatus.builder()
							   .message("This is a mocked Data")
							   .status("Valid")
							   .build();
WarrantyCoverageResponse response = WarrantyCoverageResponse.builder()
												 .contracts(contractsList)
												 .serviceStatus(serviceStatus)
												 .build();
return response;
	}

}
