package com.listgroupquestions;

import java.util.ArrayList;

//Write a Java program to check whether a given element exists in a List or not.
public class Exist {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(98);
	list.add(78);
	list.add(12);
	list.add(15);
	list.add(987);
	System.out.println(list.contains(15));
	
}
}
          