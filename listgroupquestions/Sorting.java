package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to sort a List of integers in ascending order.
public class Sorting {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();

	list.add(98);
	list.add(78);
	list.add(12);
	list.add(15);
	list.add(987);
	list.sort(null);
	System.out.println("Ascending order ="+list);
	
}
}
