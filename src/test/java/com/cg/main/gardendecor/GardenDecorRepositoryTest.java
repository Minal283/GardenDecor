package com.cg.main.gardendecor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.gardendecor.model.GardenDecor;
import com.cg.main.gardendecor.repository.DecorRepository;

import java.util.List;

@SpringBootTest
class GardenDecorRepositoryTest {
	@Autowired
	DecorRepository repository;
 @Test
 void testGetAllGardenDecorsByName() {
	 List<GardenDecor> gardendecor=repository.findAllByProductName("lamp");
	 String name=gardendecor.get(0).getProductName();
	assertEquals("lamp",name);	 
 }
	
}
