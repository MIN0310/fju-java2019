package com.aaa;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	
public class tester {

	public static void main(String[] args) {
			List<Integer> bag = new ArrayList<>();
			bag.add(3);
			bag.add(90);
			bag.add(3);
			bag.add(54);
			System.out.println(bag);
			//會按照寫得順序印出來且重複的數字也會印出
			
			int index = bag.indexOf(54);
			System.out.println(index);
			//可以找出54從前面算起來在第幾個
			
			Set<Integer> bag2 = new HashSet<>();
			bag2.add(3);
			bag2.add(90);
			bag2.add(3);
			bag2.add(54);
			System.out.println(bag2);
			//會按照數字大小印出來且重複的數字不會印出

	}

}
