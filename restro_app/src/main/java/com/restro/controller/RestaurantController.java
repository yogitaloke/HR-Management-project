//package com.restro.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.responseType.QueryStatus;
//import com.restro.entity.Restaurant;
//import com.restro.exception.RestaurantNotFound;
//import com.restro.repository.RestaurantRepository;
//
//import jakarta.transaction.Transactional;
//
//@RestController
//@Transactional
//@CrossOrigin
//public class RestaurantController {
//	
////	
////	@ExceptionHandler(RestaurantNotFound.class)
////	public ResponseEntity<String> handleRestaurantNotFound(RestaurantNotFound restaurantNotFound)
////	{
////		return new ResponseEntity<>("Restaurant not found",HttpStatus.NOT_FOUND);
////	}
////	
//	@Autowired
//	RestaurantRepository restaurantRepository;
//	
//
//	
//	// TODO: Get all restaurants
//	@GetMapping("restaurants")
//	public List<Restaurant> getRestaurants() {
//		return (List<Restaurant>) restaurantRepository.findAll();
//	}
//
//	// TODO: Save a new restaurant
//	@PostMapping("restaurants")
//	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
//		return restaurantRepository.save(restaurant);
//	}
//
//	// TODO: Delete a restaurant
//	@DeleteMapping("restaurants/{restaurantId}")
//	public QueryStatus deleteRestaurant(@PathVariable int restaurantId) {
//		Integer res = restaurantRepository.deleteByRestaurantId(restaurantId);
//		if(res == 1)
//			return new QueryStatus (true);
//		throw new RestaurantNotFound();
//	}
//	
//	
////TODO: Find restaurant by id  here if i m search restaurant that is not present so here they throw error 
////	@GetMapping("restaurants/find/{restaurantId}")
////	public Restaurant getRestaurant(@PathVariable int restaurantId)
////	{
////		return restaurantRepository.findById(restaurantId).get();
////	}
//
//	
////TODO: Find restaurant by id to accept null value( one way to solve error)
////	@GetMapping("restaurants/find/{restaurantId}")
////	public Restaurant getRestaurant(@PathVariable int restaurantId)
////	{
////		Optional <Restaurant> optionalRestaurant =restaurantRepository.findById(restaurantId);
////		if(optionalRestaurant.isEmpty())
////		return null;
////		return optionalRestaurant.get();
////	}
//	
//	
//	
////TODO: Find restaurant by id to accept null value( one way to solve error) and handle 404 not found error
//		@GetMapping("restaurants/find/{restaurantId}")
//		public Restaurant getRestaurant(@PathVariable int restaurantId)
//		{
//			Optional <Restaurant> optionalRestaurant =restaurantRepository.findById(restaurantId);
//			if(optionalRestaurant.isEmpty())
//			throw  new RestaurantNotFound();
//			return optionalRestaurant.get();
//		}
//	
//	
//		
////TODO sorting restaurant by name
//		
//		@GetMapping("restaurants/sort/name")
//		public List<Restaurant> sortRestaurantByName()
//		{
//			Sort nameSort = Sort.by("restaurantName");
//			return (List<Restaurant>) restaurantRepository.findAll(nameSort);
//			
//		}
//	
////TODO sorting restaurant by user choice(wrong )
////	@GetMapping("restaurant/sort/userchoice/{userChoice}")
////	public List<Restaurant> sortByUserChoice(@PathVariable String userChoice)
////	{
////		Sort nameSort =Sort.by("userChoice");
////		return (List<Restaurant>) restaurantRepository.findAll(nameSort);
////	}
//		
//		
//		// TODO: Paginate restaurants
//		@GetMapping("restaurants/results/{pageNo}/{pageSize}")
//		public List<Restaurant> paginateRestaurants(@PathVariable int pageNo, @PathVariable int pageSize){
//			Pageable pageable = PageRequest.of(pageNo, pageSize);
//			Page<Restaurant> pageResult = restaurantRepository.findAll(pageable);
//			return pageResult.getContent();
//		}
//
//	
//
//}
