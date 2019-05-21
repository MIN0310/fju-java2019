package com.txt2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class split {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("sales.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader in = new BufferedReader(isr);
		String line = in.readLine();
		while(line != null) {
			System.out.println(line);
			String[] tokens = line.split(" ");
			if (tokens.length == 2) {
				System.out.println(tokens[0] + "/" + tokens[1]);
				int n = Integer.parseInt(tokens[1]);
				
				if(n>10) {
					int total = (n-10)*3000;
					System.out.println("獎金:" + tokens[0] +total);
				}
			}
			line = in.readLine();
		}
	}

}
