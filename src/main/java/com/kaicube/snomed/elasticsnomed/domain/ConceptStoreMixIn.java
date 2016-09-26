package com.kaicube.snomed.elasticsnomed.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

public abstract class ConceptStoreMixIn {

	@JsonIgnore
	abstract String getId();

	@JsonIgnore
	abstract Set<Description> getDescriptions();

	@JsonIgnore
	abstract Set<Relationship> getRelationships();

}
