package com.ccc;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		Random rand = new Random();
//		int[] freqs = new int[20];
		List<Integer> list = new ArrayList();
		for(int i=0; i<20; i++) {
			list.add(0);
		}
		for(int i=0; i<10000; i++) {
			int r =rand.nextInt(20);
//			list.add(r);
//			freqs[r]++;
			Integer freq = list.get(r);
			list.set(r,  freq+1);
		}
		System.out.println(list);
	}

}
