package com.graphql.GraphqlPOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.graphql.GraphqlPOC.service.APWarrantyDataFetcher;
import com.graphql.GraphqlPOC.service.BaseWarrantyDataFetcher;
import com.graphql.GraphqlPOC.service.ExtendedWarrantyDataFetcher;
import com.graphql.GraphqlPOC.service.MEandAFWarrantyDataFetcher;
import com.graphql.GraphqlPOC.service.Query;

@Configuration
public class GraphqlConfiguration {

	@Bean
	public Query graphqlQuery(APWarrantyDataFetcher apWarrantyDataFetcher, 
							ExtendedWarrantyDataFetcher extendedWarrantyDataFetcher,
							BaseWarrantyDataFetcher baseWarrantyDataFetcher,
							MEandAFWarrantyDataFetcher meAndAFWarrantyDataFetcher) {
		return new Query(apWarrantyDataFetcher, 
				extendedWarrantyDataFetcher, 
				baseWarrantyDataFetcher, meAndAFWarrantyDataFetcher);
	}
	

}
