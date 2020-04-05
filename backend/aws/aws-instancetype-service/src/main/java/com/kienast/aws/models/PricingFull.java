package com.kienast.aws.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricingFull {

	@JsonProperty("eu-central-1")
	private PricingRegion region;
	

	public PricingRegion getRegion() {
		return region;
	}

	public void setRegion(PricingRegion region) {
		this.region = region;
	}
	
	public PricingFull() {}
	
	public PricingFull(PricingRegion region) {
		this();
		this.region = region;
	}
}
