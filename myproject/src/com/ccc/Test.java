package com.ccc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer, Integer> m = new HashMap();
		for(int i=0; i<1000; i++) {
			int r = rand.nextInt(21);
			Integer freq = m.get(r);
			if(freq == null) {
				m.put(r, 1);
			}else {
				m.put(r, freq+1);
			}
			
		}
		System.out.println(m);
	}

}
