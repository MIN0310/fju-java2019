package com.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Item> lists = new ArrayList<>();
		String thing = "";
			
		while(!thing.equals("q")) {
				
			System.out.println("Write your thing:");
			thing = scanner.next();
			System.out.println("How many:");
			int number = scanner.nextInt();
			scanner.nextLine();
			lists.add(new Item(thing, number));
				
			for(Item list : lists) {
				System.out.println(list.thing + "\t" + list.number);
			}
			
		}	
			
	}
	
}



