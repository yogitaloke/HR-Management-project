package com.restro.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.restro.entity.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>,PagingAndSortingRepository<Restaurant, Integer> {

	Integer deleteByRestaurantId(Integer restaurantId);
	
}
