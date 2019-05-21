package com.txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		File file = new File("C:\\cygwin");
		if (file.exists() && file.isDirectory()) {
			File[] dir = file.listFiles();
			for(File f : dir) {
				System.out.println(f.getName());
			}
		}
		File ff = new File(file, "oooooo\\iiii\\oioioi");
		System.out.println(ff.mkdirs());
//		System.out.println(ff.delete());
//		//只能刪掉一層
		
//		try {
//			FileReader f = new FileReader("abc.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		File file = new File("abc.txt");
//		System.out.println(file.canExecute());
//		System.out.println(file.exists());
//		System.out.println(file.length());
//		System.out.println(file.getAbsolutePath());
		
		
	}

}
