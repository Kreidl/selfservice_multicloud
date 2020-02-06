package com.kienast.aws.models;

import java.util.List;


public class AWSTypeList {

	private List<AWSInstanceType> types;
	
	public AWSTypeList() {
		
	}

	public AWSTypeList(List<AWSInstanceType> types) {
		super();
		this.types = types;
	}

	public List<AWSInstanceType> getTypes() {
		return types;
	}

	public void setTypes(List<AWSInstanceType> types) {
		this.types = types;
	}
}
