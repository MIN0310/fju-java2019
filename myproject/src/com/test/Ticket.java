package com.test;

public class Ticket {
	String start;
	String destination;
	private int price;
	
	public Ticket(String start, String destination, int price) {
		this.start = start;
		this.destination = destination;
		this.price = price;
		
	}
	public void print() {
		System.out.println(start + "\t" + destination + "\t" + price);
	}
}
