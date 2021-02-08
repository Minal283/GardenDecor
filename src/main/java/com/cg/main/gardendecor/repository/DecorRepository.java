package com.cg.main.gardendecor.repository;

import java.util.List;
/**
 * DecorRepository class extends JpaRepository
 * @author minal koli
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.gardendecor.model.GardenDecor;

@Repository  //Indicates that an annotated class is a Repository
public interface DecorRepository extends JpaRepository<GardenDecor, Integer> {
/**
 * 
 * @param productName
 * @return findAllByProductName
 */
	public List<GardenDecor> findAllByProductName(String productName);

}


