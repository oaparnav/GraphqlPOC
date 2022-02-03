package com.graphql.GraphqlPOC.service;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.GraphqlPOC.model.ExtendedWarrantyCoverageResponse;
import com.graphql.GraphqlPOC.model.WarrantyCoverage;
import com.graphql.GraphqlPOC.model.WarrantyCoverageLookupResponse;
import com.graphql.GraphqlPOC.model.WarrantyCoverageResponse;


public class Query implements GraphQLQueryResolver {

    private final APWarrantyDataFetcher apWarrantyDataFetcher;
	private final ExtendedWarrantyDataFetcher extendedWarrantyDataFetcher;
    private final BaseWarrantyDataFetcher baseWarrantyDataFetcher;
    private final MEandAFWarrantyDataFetcher meAndAFWarrantyDataFetcher;
    
    public Query(APWarrantyDataFetcher apWarrantyDataFetcher, ExtendedWarrantyDataFetcher extendedWarrantyDataFetcher,
			BaseWarrantyDataFetcher baseWarrantyDataFetcher, MEandAFWarrantyDataFetcher meAndAFWarrantyDataFetcher) {
		this.apWarrantyDataFetcher = apWarrantyDataFetcher;
		this.extendedWarrantyDataFetcher = extendedWarrantyDataFetcher;
		this.baseWarrantyDataFetcher = baseWarrantyDataFetcher;
		this.meAndAFWarrantyDataFetcher = meAndAFWarrantyDataFetcher;
	}


    public WarrantyCoverage warrantyrAp(String vin) {
        return apWarrantyDataFetcher.get(vin);
    }
    
    public WarrantyCoverageLookupResponse baseInfoEU(String vin, String country, String language) {
    	return baseWarrantyDataFetcher.get(vin, country, language);
    }
    
    public ExtendedWarrantyCoverageResponse extendedInfoEU(String vin) {
    	return extendedWarrantyDataFetcher.get(vin);
    }
    
    public WarrantyCoverageResponse warrantyMEandAF(String vin, String country) {
    	return meAndAFWarrantyDataFetcher.get(vin, country);
    }
}