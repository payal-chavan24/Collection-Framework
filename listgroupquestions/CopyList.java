package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to copy all elements from one List to another List.
public class CopyList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(98);
		list1.add(78);
		list1.add(12);
		list1.add(15);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (Integer integer : list1) {
			list2.add(integer);

		}
		System.out.println("Second list" + list2);

	}
}
