package com.HW3;

public class Wizard extends Thread{
	public void thunder() {
		System.out.println("THUNDER START!");
		try {
			sleep(2000);
			System.out.println("THUNDER END!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		thunder();
	}

}
