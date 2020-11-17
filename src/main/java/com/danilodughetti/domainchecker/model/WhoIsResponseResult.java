package com.danilodughetti.domainchecker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WhoIsResponseResult {

	@JsonProperty("admin_address")
	private String adminAddress;

	@JsonProperty("admin_name")
	private String adminName;
	
	@JsonProperty("admin_organization")
	private String adminOrganization;
	
	@JsonProperty("creation_date")
	private String creationDate;
	
	@JsonProperty("domain_name")
	private String domainName;
	
	@JsonProperty("expiration_date")
	private String expirationDate;
	
	@JsonProperty("name_servers")
	private List<String> serversName;
	
	@JsonProperty("registrant_address")
	private String registrantAddress;
	
	@JsonProperty("registrant_organization")
	private String registrantOrganization;
	
	@JsonProperty("registrar")
	private String registrar;
	
	@JsonProperty("registrar_address")
	private String registrarAddress;
	
	@JsonProperty("registrar_name")
	private String registrarName;
	
	@JsonProperty("status")
	private List<String> status;
	
	@JsonProperty("tech_address")
	private String techAddress;
	
	@JsonProperty("tech_name")
	private String techName;
	
	@JsonProperty("tech_organization")
	private String techOrganization;
	
	@JsonProperty("updated_date")
	private String updatedDate;
}
