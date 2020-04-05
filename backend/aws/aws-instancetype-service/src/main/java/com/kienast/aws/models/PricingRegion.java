package com.kienast.aws.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricingRegion {

	
	@JsonProperty("linux")
	private Pricing linuxpricing;
	
	@JsonProperty("mswin")
	private Pricing windowspricing;
	
	public PricingRegion() {}
	
	public PricingRegion(String region, Pricing linuxpricing, Pricing windowspricing) {
		this();
		this.linuxpricing = linuxpricing;
		this.windowspricing = windowspricing;
	}


	public Pricing getLinuxpricing() {
		return linuxpricing;
	}

	public void setLinuxpricing(Pricing linuxpricing) {
		this.linuxpricing = linuxpricing;
	}

	public Pricing getWindowspricing() {
		return windowspricing;
	}

	public void setWindowspricing(Pricing windowspricing) {
		this.windowspricing = windowspricing;
	}

	
	
	
}
