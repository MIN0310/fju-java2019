package com.bbb;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	
public class example {

			public static void main(String[] args) {
				List<String> song = new ArrayList<String>();
				song.add("心跳的證明");
				song.add("血腥愛情故事");
				song.add("終於說出口");
				song.add("心跳的證明");
				song.add("愛丫愛丫");
				System.out.println(song);
				//音樂的歌單可以重複
				
				Set<String> luckyPerson = new HashSet<String>();
				luckyPerson.add("Jasmine");
				luckyPerson.add("Wendy");
				luckyPerson.add("Jaimie");
				luckyPerson.add("Jasmine");
				luckyPerson.add("Annie");
				System.out.println(luckyPerson);
				//每個人只能領一次獎，重複被抽到就不算


	}

}
