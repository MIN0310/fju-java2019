package com.horse;

public class HorseRunnable implements Runnable{
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Horse1: " + i);
		}
	}
}
