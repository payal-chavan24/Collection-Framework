package com.listgroupquestions;

import java.util.LinkedList;

//Write a Java program to add, update, and remove elements from a List.
public class AddUpdateRemove {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// add elements
		list.add("Payal");
		list.add("patil");
		list.add(23);
		list.add('A');
		System.out.println(list);
		// update elements
		System.out.println(list.set(1, "Chavan"));
		System.out.println(list);

		System.out.println(list.remove(2));// remove
		System.out.println(list);
	}
}
