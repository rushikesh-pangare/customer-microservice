package com.example.consumermicroservice.entities;

import java.math.BigDecimal;

public class Book {
	
	private Integer bookId;
	private String bookName;
	private BigDecimal bookCost;
	private BigDecimal quantity;
	private BigDecimal totalCost;
	private String environment;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BigDecimal getBookCost() {
		return bookCost;
	}
	public void setBookCost(BigDecimal bookCost) {
		this.bookCost = bookCost;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public Book(Integer bookId, String bookName, BigDecimal bookCost, BigDecimal quantity, BigDecimal totalCost,
			String environment) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.environment = environment;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + ", quantity=" + quantity
				+ ", totalCost=" + totalCost + ", environment=" + environment + "]";
	}
	
	
	

}
