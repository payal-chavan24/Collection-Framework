package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
//	1> Problem Statement:
//
//		You are building a system for an institute.
//
//		You have a list of student names (ArrayList<String>)
//		Perform following operations:
//		 Tasks:
//		Remove duplicate names
//		Sort names alphabetically
//		Find names starting with a vowel
//		Count frequency of each name
//		Find the longest name
//		Convert all names to uppercase
		// You have a list of student names (ArrayList<String>)
		List<String> list1 = new ArrayList<>();
		list1.add("Payal");
		list1.add("Neha");
		list1.add("Asha");
		list1.add("Sonali");
		list1.add("Shruti");
		list1.add("Shruti");
		list1.add("Pari");
		// Remove duplicate names
		LinkedHashSet<String> set = new LinkedHashSet<>(list1);
		List<String> list2 = new ArrayList<>(set);
		System.out.println(list2);
		// Sort names alphabetically
		Collections.sort(list2);// methods in Collections class
		System.out.println(list2);
//	Find names starting with a vowel
		for (String string : list2) {
			char ch = string.charAt(0);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(string);
			}
		}
		// Count frequency of each name
		HashMap<String, Integer> map = new HashMap<>();
		for (String string : list1) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);

			} else {
				map.put(string, 1);
			}
		}
		System.out.println(map);
//		Find the longest name
		 
		String longest=list1.get(0);
		 for (String string : list2) {
			if(string.length()>longest.length()) {
				longest=string;
				
			}
		}
		 System.out.println("Longest String ="+longest);
//			Convert all names to uppercase
		 ArrayList<String> arr=new ArrayList<>();
		 for (String str:list1) {
			  
			arr.add(str.toUpperCase());
		}
	}
}
