package com.HW;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("英文成績:");
			Score english = new Score(scanner.nextLine());
			System.out.println("數學成績:");
			Score math = new Score(scanner.nextLine());
			int average = (english.value + math.value)/2;
			System.out.println("平均:" + average);
		} catch(ScoreFormatException e){
			e.printStackTrace();	
		}
	}
}
