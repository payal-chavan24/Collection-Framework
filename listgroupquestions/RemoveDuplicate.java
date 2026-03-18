package com.listgroupquestions;

import java.util.Vector;

//Write a Java program to remove duplicate elements from a List.
public class RemoveDuplicate {
	public static void main(String[] args) {
		Vector ve = new Vector();
		ve.add(32);
		ve.add("payal");
		ve.add("payal");
		ve.add(true);
		ve.add(true);
		for (int i = 0; i < ve.size(); i++) {
			for (int j = i + 1; j < ve.size(); j++) {
				if (ve.get(i).equals(ve.get(j))) {
					ve.remove(i);

				}

			}

		}
		System.out.println(ve);

	}
}
