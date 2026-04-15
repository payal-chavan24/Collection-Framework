package com.collectionFrameWork;

import java.util.Objects;

public class Product {
String name ;
int price ;

public Product(String name ,int price) {
	this.name=name;
	this.price=price;
	
	
}

@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name, price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(name, other.name) && price == other.price;
}


}
