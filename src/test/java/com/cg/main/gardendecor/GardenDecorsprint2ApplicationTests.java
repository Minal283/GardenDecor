package com.cg.main.gardendecor;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * @author minal koli
 */

import com.cg.main.gardendecor.controller.GardenDecorController;

@SpringBootTest
class GardenDecorsprint2ApplicationTests {
//AutoWire Controller class
	@Autowired
	private GardenDecorController controller;

	@Test
	void contextLoads() {
		boolean result = true;
		if (controller.equals(null))
			result = false;
		assertTrue(result);

	}
}
