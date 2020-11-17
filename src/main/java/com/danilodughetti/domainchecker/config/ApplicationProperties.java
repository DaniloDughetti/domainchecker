package com.danilodughetti.domainchecker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

	@Value("${whois.url}")
	private String whoIsUrl;

	@Value("${whois.apikey}")
	private String whoIsApiKey;

	public String getWhoIsUrl() {
		return whoIsUrl;
	}

	public void setWhoIsUrl(String whoIsUrl) {
		this.whoIsUrl = whoIsUrl;
	}

	public String getWhoIsApiKey() {
		return whoIsApiKey;
	}

	public void setWhoIsApiKey(String whoIsApiKey) {
		this.whoIsApiKey = whoIsApiKey;
	}
}
