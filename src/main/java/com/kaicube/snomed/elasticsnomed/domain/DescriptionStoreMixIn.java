package com.kaicube.snomed.elasticsnomed.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public abstract class DescriptionStoreMixIn {

	@JsonIgnore
	abstract Map<String, String> getAcceptabilityMap();

}
