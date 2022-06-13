package com.example.consumermicroservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumermicroservice.entities.Book;

@RestController
public class ConsumerBookController {
	
	@Autowired
	private ProducerProx producerProx;
	
	@GetMapping("/studentservice/findCost/{bookname}/quantity/{quantity}")
	public Book getTotalCost(@PathVariable String bookname, @PathVariable BigDecimal quantity) {
		
		Logger logger = LoggerFactory.getLogger(getClass());
		
		Book book = producerProx.retrieveBookCost(bookname);
		logger.info("Bookname"+bookname);
		logger.info("Quantity"+quantity);
		return new Book(
				book.getBookId(),
				book.getBookName(),
				book.getBookCost(),
				quantity,
				quantity.multiply(book.getBookCost()),
				book.getEnvironment()
				);
	}

}
