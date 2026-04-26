package com.arraypractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Write a program to find duplicate elements in a 1D array.
public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 36,   12, 26,  89, 12,35,36,12,26 };
//		for (int i = 0; i < arr.length; i++) {
//			boolean isRepeated = false;
//			boolean isalredyprint = false;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					isRepeated = true;
//
//				}
//
//			}
//			for (int k = 0; k < i; k++) {
//				if (arr[i] == arr[k]) {
//					isalredyprint = true;
//
//				}
//
//			}
//
//			if (isRepeated == true && isalredyprint == false)
//
//			{
//
//				System.out.println(arr[i]);
//			}
//
//		}
	
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		
		
		for (Object integer : arr) {
            if(!set.contains(integer)) {
            	set1.add((Integer) integer);
            	
            }
		}
		System.out.println("Duplicate  value ="+set1);

	}
}
