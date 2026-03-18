package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to find the size of a List and print the first and last element.
public class SizeList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Payal");
		list.add(234);
		list.add(789);
		list.add(23.98f);
		list.add('A');
		System.out.println(list.size());
		System.out.println("First elements =" + list.getFirst());
		System.out.println("Last elements =" + list.getLast());

	}
}
