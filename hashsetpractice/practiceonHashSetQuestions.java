package com.hashsetpractice;

import java.util.HashSet;

public class practiceonHashSetQuestions {
	public static void main(String[] args) {
		// 1)Create a HashSet and add 5 string values.
		HashSet<String> set = new HashSet<String>();
		set.add("Payal");
		set.add("bhanudas");
		set.add("chavan");
		set.add("lives in");
		set.add("pune");
		System.out.println(set);
		// 2)Try to add duplicate elements in a Set and observe the output.
		set.add("Payal");
		System.out.println(set);// duplicate wont allowed
		for (String object : set) {
			System.out.println(object);
		}
		// 3)Check whether a specific element exists in a Set.
		System.out.println(set.contains("Payal"));
		// 4)Remove an element from a Set.
		System.out.println(set.remove("Payal"));
		System.out.println("--------------");
		//5) Find total number of elements in a Set.
		System.out.println("numbwe of elements ="+set.size());
		//6)

	}
}