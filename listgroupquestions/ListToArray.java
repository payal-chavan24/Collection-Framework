package com.listgroupquestions;
//Write a Java program to convert a List into an array and print the array elements.

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(98);
		list1.add(78);
		list1.add(12);
		list1.add(15);
		Integer[] arr = list1.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}
