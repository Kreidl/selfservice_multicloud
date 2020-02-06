package com.kienast.aws.models;


import com.fasterxml.jackson.annotation.JsonProperty;


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
	
	
	public AWSInstanceType() {
		
	}
	public AWSInstanceType(String name, String type, float memory, int cpu, String network, int iops) {
		super();
		this.name = name;
		this.type = type;
		this.memory = memory;
		this.cpu = cpu;
		this.network = network;
		this.iops = iops;
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
	
	
}
