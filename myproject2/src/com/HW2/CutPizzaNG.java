package com.HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CutPizzaNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("比薩想切幾片？");
		try {
		int piece = scanner.nextInt();
		scanner.nextLine();

		if(piece==0) {
			System.out.println("你確定不要切？");
		}else if(piece>0&&piece<16&&piece!=8&&piece!=12&&piece!=16) {
			System.out.println("數量錯誤");
		}else if(piece>16||piece<1) {
			System.out.println("超出範圍");
		}else if(piece==8||piece==12||piece==16) {
			System.out.println("謝謝選購");
		}
		}catch(InputMismatchException e) {
			System.out.println("格式錯誤");
		}
	}
}
