package com.danilodughetti.domainchecker.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danilodughetti.domainchecker.config.ApplicationProperties;
import com.danilodughetti.domainchecker.model.WhoIsResponse;
import com.danilodughetti.domainchecker.utils.ApplicationConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class WhoIsService {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private ApplicationProperties applicationProperties;

	public WhoIsResponse getDomainInfo(String domainName) throws JsonMappingException, JsonProcessingException, IOException {
		OkHttpClient httpClient = new OkHttpClient();
	    HttpUrl.Builder httpBuilder = HttpUrl.parse(applicationProperties.getWhoIsUrl())
	            .newBuilder().addQueryParameter(ApplicationConstants.WhoIs.QueryParameters.DOMAIN, domainName);
	    
	    Request request = new Request.Builder()
	              .url(httpBuilder.build())
	              .addHeader(ApplicationConstants.WhoIs.HeaderKey.APIKEY, this.applicationProperties.getWhoIsApiKey())
	              .build();
	    
	    try (Response response = httpClient.newCall(request).execute()) {
	        return this.objectMapper.readValue(response.body().string(), WhoIsResponse.class);
	      }
	}
}
