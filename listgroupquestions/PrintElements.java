package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to store 5 integer elements in an ArrayList and print all elements.
public class PrintElements {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(23);
	list.add(2);
	list.add(29);
	list.add(89);
	list.add(89);
	 for (Integer integer : list) {
		System.out.println(integer);
	}
}
}
