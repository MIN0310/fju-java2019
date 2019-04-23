package com.HW;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("數學成績:");
			int math = scanner.nextInt();
			scanner.nextLine();
			System.out.println("英文成績:");
			int english = scanner.nextInt();
			scanner.nextLine();
			int average = (math + english)/2;
			System.out.println("平均:" + average);
	}

}
