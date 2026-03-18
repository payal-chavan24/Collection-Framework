package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to iterate a List using:
//for-each loop
public class Iterate {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList();
	list.add(98);
	list.add(78);
	list.add(12);
	list.add(15);
	list.add(987);
	 for (Integer integer : list) {
		System.out.println(integer);
	}
	
}
}
