package com.kienast.aws.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InstanceTypeControllerTest {
	
	InstanceTypeController instanceTypeController;

	@BeforeEach
	void init () {
		instanceTypeController = new InstanceTypeController();
	}
	
	@Test
	@DisplayName("Check if list is not null")
	void typeListNotNull() {
		assertTrue(instanceTypeController.getTypes() != null && instanceTypeController.getTypes().getTypes().get(0) != null);
	}


}
