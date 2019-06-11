package com.address;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Address {

	public static void main(String[] args) throws Exception{
		ArrayList<String> cities = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		String line = br.readLine();
		City lastCity = new City("");
		while(line != null) {
			System.out.println(line);
			String[] tokens = line.split(",");
			if(!lastCity.name.equals(tokens[0])) {
				lastCity = new City(tokens[0]);
				cities.add(lastCity);
			}
			line = br.readLine();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please choose city:");
			for (int i=0; i<cities.size(); i++) {
				System.out.println(i+ ":" + cities.get(i).name);
			}
			int cityId = Integer.parseInt(scanner.nextLine());
			City city = cities.get(cityId);
			for(int i=0; i<city.areas.size(); i++) {
				System.out.println(i + ":" + city.areas.get(i).name);
			}
			int areaId = Integer.parseInt(scanner.nextLine());
			System.out.println("post code is" + city.areas.get(areaId).code);
			
		}
	}

}
