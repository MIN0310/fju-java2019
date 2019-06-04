package com.thread;

public class Tester {

	public static void main(String[] args) {
		Breakfast bf = new Breakfast();
		bf.start();
		
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		
		try {
			bf.join();
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end");
//		int countDown = 10;
//		System.out.println(countDown++);
//		System.out.println(countDown);
	}

}
