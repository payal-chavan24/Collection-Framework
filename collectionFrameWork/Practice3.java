package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Practice3 {
public static void main(String[] args) {
//	3> Email Management System
//	 Problem:
//
//	You have a list of emails.
//
//	Tasks:
//	Remove duplicate emails
//	Validate emails (must contain @ and .)
//	Group emails by domain (gmail, yahoo, etc.)
//	Count how many users per domain
//	Sort emails by domain name
	ArrayList<String> list=new ArrayList<>();
	list.add("Payalchavan123@gmail.com");
	list.add("Payalchavan23@gmail.com");
	list.add("nehapatil@gmail.com");
	list.add("rahul675@yahoon");
	list.add("shyam353");
	list.add("shyam@353");
	list.add("shyam353@yahoon.com");
	HashSet<String> set=new HashSet<>(list);
	System.out.println(set);
	for (String string : set) {
		if(string.contains("@")) {
		//	System.out.println(string);
			
			
		}
	}
	ArrayList<String> gmail=new ArrayList<>();
	ArrayList<String> yahoon=new ArrayList<>();
	ArrayList<String> invalid=new ArrayList<>();
	int gmailCount=0;
	int yahoonCount=0;
	int otherCount=0;
	for (String string : set) {
		if(string.contains("gmail")) {
			gmail.add(string);
			gmailCount++;
		}else if(string.contains("yahoon")) {
		yahoon.add(string);
		yahoonCount++;
		}else {
			invalid.add(string);
			otherCount++;
		}
	}
	System.out.println("Gmail"+gmail+"count of Gmail domain are ="+gmailCount);
	System.out.println("YAhoon ="+yahoon+"count of yahoon domain are ="+yahoonCount);
	System.out.println("other ="+invalid+"count of invalid domain are ="+otherCount);
	
	
	

}
}
