package com.kienast.aws.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AWSInstanceType {

	@JsonProperty("pretty_name")
	private String name;
	@JsonProperty("instance_type")
	private String type;
	@JsonProperty("memory")
	private float memory;
	@JsonProperty("vCPU")
	private int cpu;
	@JsonProperty("network_performance")
	private String network;
	@JsonProperty("ebs_iops")
	private int iops;
	private Map<String,Object> linux;
	private Map<String,Object> reservedlinux;
	private Map<String,Object> windows;
	private Map<String,Object> reservedwindows;
	//private List<Pricing> pricing = new ArrayList<Pricing>();
	/*@JsonProperty("pricing.eu")
	private List pricing;*/
	@SuppressWarnings("unchecked")
    @JsonProperty("pricing")
	private PricingFull pricings;
	
    /*private void unpackNested(Map<String,Object> pricing) {
		//Map<String,Map<String, Object>> eucentral1 = (Map<String,Map<String, Object>>)pricing.get("eu-central-1");
		//if(!eucentral1.get("linux").isEmpty()) {
			this.pricings = pricing.get("eu-central-1").toString();
		//}
		
        //this.eucentral1 = pricing.get("eu-central-1");
        //((List<Pricing>) pricing).add(new Pricing("linux"));
        
        //Map<String,String> owner = (Map<String,String>)pricing.get("owner");
    }*/
	
	
	public AWSInstanceType() {
	}
	public AWSInstanceType(String name, String type, float memory, int cpu, String network, int iops) {
		this();
		this.name = name;
		this.type = type;
		this.memory = memory;
		this.cpu = cpu;
		this.network = network;
		this.iops = iops;
		
		//System.out.println(this.pricing);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getMemory() {
		return memory;
	}
	public void setMemory(float memory) {
		this.memory = memory;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public int getIops() {
		return iops;
	}
	public void setIops(int iops) {
		this.iops = iops;
	}
	public PricingFull getPricings() {
		return pricings;
	}
	public void setPricings(PricingFull pricings) {
		this.pricings = pricings;
	}
	
	
	
	
}
