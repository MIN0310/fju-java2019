package com.lotto;

import java.util.Scanner;

public class LotteryException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bonus = 200000;
		int money = 0;
		System.out.println("多少人得獎?");
		String p = scanner.nextLine();
		try {
			int people = Integer.parseInt(p);
			money = bonus/people;
			System.out.println("每人得:" + money);
		} catch( ArithmeticException e) {
			System.out.println("數值運算錯誤");
		} catch( NumberFormatException e) {
			System.out.println("數值格式錯誤");
//		} catch( Exception e) {
//			System.out.println("數值輸入錯誤);
		}
	}

}
