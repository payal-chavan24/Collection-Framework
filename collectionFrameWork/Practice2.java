package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Practice2 {
	public static void main(String[] args) {
//	2> Problem Statement:
//
//		You are managing products in an e-commerce system.
//
//		Each product has:
//
//		name
//		price
//
//		Store products using ArrayList
//		Tasks:
//		Add multiple products
//		Find product with highest price
//		Sort products by price (ascending & descending)
//		Filter products with price > 500
//		Search product by name
//		Remove duplicate product names
		// Add multiple products
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Mobile", 39000));
		list.add(new Product("Fridge", 49000));
		list.add(new Product("Tv", 29000));
		list.add(new Product("Laptop", 69000));
		list.add(new Product("Laptop", 69000));

//	Find product with highest price
		Product highest = list.get(0);

		for (Product p : list) {
			if (p.price > highest.price) {
				highest = p;

			}
		}
		System.out.println("Highest price =" + highest.name + highest);
//	Sort products by price (ascending & descending)
		list.sort((p1, p2) -> p1.price - p2.price);
		System.out.println("Ascending order =" + list);// comparator with lambda

		list.sort((p1, p2) -> p2.price - p1.price);
		System.out.println("Descending order =" + list);

//	Filter products with price > 500
		for (Product p : list) {
			if (p.price > 500) {
				System.out.println(p.name + " " + p.price);

			}
		}
//	Search product by name
		String search = "Laptop";
		boolean isfound = false;
		for (Product product : list) {
			if (product.equals(search)) {
				System.out.println("product found");
				isfound = true;
				break;

			}
		}
		if (isfound == false) {
			System.out.println("Product not found");

		}
//	Remove duplicate product names
		HashSet<Product> set = new HashSet<>(list);
		ArrayList<Product> list1 = new ArrayList(set);
		System.out.println(set);

	}
}
