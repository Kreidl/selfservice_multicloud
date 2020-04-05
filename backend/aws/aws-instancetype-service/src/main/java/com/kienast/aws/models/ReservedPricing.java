package com.kienast.aws.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReservedPricing {
	
	@JsonProperty("yrTerm1Convertible.allUpfront")
	private double yrTerm1ConvertibleallUpfront;
	@JsonProperty("yrTerm1Convertible.noUpfront")
    private double yrTerm1ConvertiblenoUpfront;
	@JsonProperty("yrTerm1Convertible.partialUpfront")
    private double yrTerm1ConvertiblepartialUpfront;
	@JsonProperty("yrTerm1Standard.allUpfront")
    private double yrTerm1StandardallUpfront;
	@JsonProperty("yrTerm1Standard.noUpfront")
    private double yrTerm1StandardnoUpfront;
	@JsonProperty("yrTerm1Standard.partialUpfront")
    private double yrTerm1StandardpartialUpfront;
	@JsonProperty("yrTerm3Convertible.allUpfront")
    private double yrTerm3ConvertibleallUpfront;
	@JsonProperty("yrTerm3Convertible.noUpfront")
    private double yrTerm3ConvertiblenoUpfront;
	@JsonProperty("yrTerm3Convertible.partialUpfront")
    private double yrTerm3ConvertiblepartialUpfront;
	@JsonProperty("yrTerm3Standard.allUpfront")
    private double yrTerm3StandardallUpfront;
	@JsonProperty("yrTerm3Standard.noUpfront")
    private double yrTerm3StandardnoUpfront;
	@JsonProperty("yrTerm3Standard.partialUpfront")
    private double yrTerm3StandardpartialUpfront;
	
	public ReservedPricing() {}
	
	public ReservedPricing(double yrTerm1ConvertibleallUpfront, double yrTerm1ConvertiblenoUpfront,
			double yrTerm1ConvertiblepartialUpfront, double yrTerm1StandardallUpfront, double yrTerm1StandardnoUpfront,
			double yrTerm1StandardpartialUpfront, double yrTerm3ConvertibleallUpfront,
			double yrTerm3ConvertiblenoUpfront, double yrTerm3ConvertiblepartialUpfront,
			double yrTerm3StandardallUpfront, double yrTerm3StandardnoUpfront, double yrTerm3StandardpartialUpfront) {
		this();
		this.yrTerm1ConvertibleallUpfront = yrTerm1ConvertibleallUpfront;
		this.yrTerm1ConvertiblenoUpfront = yrTerm1ConvertiblenoUpfront;
		this.yrTerm1ConvertiblepartialUpfront = yrTerm1ConvertiblepartialUpfront;
		this.yrTerm1StandardallUpfront = yrTerm1StandardallUpfront;
		this.yrTerm1StandardnoUpfront = yrTerm1StandardnoUpfront;
		this.yrTerm1StandardpartialUpfront = yrTerm1StandardpartialUpfront;
		this.yrTerm3ConvertibleallUpfront = yrTerm3ConvertibleallUpfront;
		this.yrTerm3ConvertiblenoUpfront = yrTerm3ConvertiblenoUpfront;
		this.yrTerm3ConvertiblepartialUpfront = yrTerm3ConvertiblepartialUpfront;
		this.yrTerm3StandardallUpfront = yrTerm3StandardallUpfront;
		this.yrTerm3StandardnoUpfront = yrTerm3StandardnoUpfront;
		this.yrTerm3StandardpartialUpfront = yrTerm3StandardpartialUpfront;
	}
	
	public double getYrTerm1ConvertibleallUpfront() {
		return yrTerm1ConvertibleallUpfront;
	}
	public void setYrTerm1ConvertibleallUpfront(double yrTerm1ConvertibleallUpfront) {
		this.yrTerm1ConvertibleallUpfront = yrTerm1ConvertibleallUpfront;
	}
	public double getYrTerm1ConvertiblenoUpfront() {
		return yrTerm1ConvertiblenoUpfront;
	}
	public void setYrTerm1ConvertiblenoUpfront(double yrTerm1ConvertiblenoUpfront) {
		this.yrTerm1ConvertiblenoUpfront = yrTerm1ConvertiblenoUpfront;
	}
	public double getYrTerm1ConvertiblepartialUpfront() {
		return yrTerm1ConvertiblepartialUpfront;
	}
	public void setYrTerm1ConvertiblepartialUpfront(double yrTerm1ConvertiblepartialUpfront) {
		this.yrTerm1ConvertiblepartialUpfront = yrTerm1ConvertiblepartialUpfront;
	}
	public double getYrTerm1StandardallUpfront() {
		return yrTerm1StandardallUpfront;
	}
	public void setYrTerm1StandardallUpfront(double yrTerm1StandardallUpfront) {
		this.yrTerm1StandardallUpfront = yrTerm1StandardallUpfront;
	}
	public double getYrTerm1StandardnoUpfront() {
		return yrTerm1StandardnoUpfront;
	}
	public void setYrTerm1StandardnoUpfront(double yrTerm1StandardnoUpfront) {
		this.yrTerm1StandardnoUpfront = yrTerm1StandardnoUpfront;
	}
	public double getYrTerm1StandardpartialUpfront() {
		return yrTerm1StandardpartialUpfront;
	}
	public void setYrTerm1StandardpartialUpfront(double yrTerm1StandardpartialUpfront) {
		this.yrTerm1StandardpartialUpfront = yrTerm1StandardpartialUpfront;
	}
	public double getYrTerm3ConvertibleallUpfront() {
		return yrTerm3ConvertibleallUpfront;
	}
	public void setYrTerm3ConvertibleallUpfront(double yrTerm3ConvertibleallUpfront) {
		this.yrTerm3ConvertibleallUpfront = yrTerm3ConvertibleallUpfront;
	}
	public double getYrTerm3ConvertiblenoUpfront() {
		return yrTerm3ConvertiblenoUpfront;
	}
	public void setYrTerm3ConvertiblenoUpfront(double yrTerm3ConvertiblenoUpfront) {
		this.yrTerm3ConvertiblenoUpfront = yrTerm3ConvertiblenoUpfront;
	}
	public double getYrTerm3ConvertiblepartialUpfront() {
		return yrTerm3ConvertiblepartialUpfront;
	}
	public void setYrTerm3ConvertiblepartialUpfront(double yrTerm3ConvertiblepartialUpfront) {
		this.yrTerm3ConvertiblepartialUpfront = yrTerm3ConvertiblepartialUpfront;
	}
	public double getYrTerm3StandardallUpfront() {
		return yrTerm3StandardallUpfront;
	}
	public void setYrTerm3StandardallUpfront(double yrTerm3StandardallUpfront) {
		this.yrTerm3StandardallUpfront = yrTerm3StandardallUpfront;
	}
	public double getYrTerm3StandardnoUpfront() {
		return yrTerm3StandardnoUpfront;
	}
	public void setYrTerm3StandardnoUpfront(double yrTerm3StandardnoUpfront) {
		this.yrTerm3StandardnoUpfront = yrTerm3StandardnoUpfront;
	}
	public double getYrTerm3StandardpartialUpfront() {
		return yrTerm3StandardpartialUpfront;
	}
	public void setYrTerm3StandardpartialUpfront(double yrTerm3StandardpartialUpfront) {
		this.yrTerm3StandardpartialUpfront = yrTerm3StandardpartialUpfront;
	}

}
