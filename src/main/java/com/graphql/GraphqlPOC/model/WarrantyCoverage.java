package com.graphql.GraphqlPOC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WarrantyCoverage {

	private String extendedServicePlan;

	private String warrantyStartDate;

	private String warrantyEndDate;

	private Long warrantyEndMileage;

	private RequestStatus requestStatus;

}
