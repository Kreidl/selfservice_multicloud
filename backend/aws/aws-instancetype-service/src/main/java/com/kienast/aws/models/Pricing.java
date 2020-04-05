package com.kienast.aws.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pricing {

	@JsonProperty("ondemand")
	private double ondemand;
	
	@JsonProperty("reserved")
	private ReservedPricing reserved;
	public ReservedPricing getReserved() {
		return reserved;
	}

	public void setReserved(ReservedPricing reserved) {
		this.reserved = reserved;
	}
	
    
    public Pricing () {}
    
	public Pricing(ReservedPricing reserved, double ondemand) {
		this();
		this.ondemand = ondemand;
		this.reserved = reserved;
	}
	

	public double getOndemand() {
		return ondemand;
	}
	public void setOndemand(double ondemand) {
		this.ondemand = ondemand;
	}
	
    
    
	
}
