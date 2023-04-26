package com.exampleClasses.DMS.repository;
/***
 * @author S555722 Manisha Reddy Arragari
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exampleClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
