package com.lotto;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bonus = 200000;
		System.out.print("多少人中獎?");
		int people = scanner.nextInt();
		scanner.nextLine();
		/*或是
		String p = scanner.nextLine();
		int people = Integer.parseInt(p);
		*/
		int money = bonus/people;
		System.out.println("每人得:" + money);
	}

}
