package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to reverse elements of a List
public class ReverseList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(98);
		list.add(78);
		list.add(12);
		list.add(15);
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));

		}
		// System.out.println(list);
	}
}
