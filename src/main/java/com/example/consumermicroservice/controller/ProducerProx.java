package com.example.consumermicroservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.consumermicroservice.entities.Book;

@FeignClient(name="producer-microservice")
public interface ProducerProx {
	

	@GetMapping("/bookservice/getbookcost/{bookName}")
	public Book retrieveBookCost(@PathVariable String bookName);

}
