package com.graphql.GraphqlPOC.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WarrantyCoverageResponse {

	public ServiceStatus serviceStatus;
    public List<Contract> contracts;
}
