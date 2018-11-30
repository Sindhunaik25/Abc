package com.stream.assignment;

public class Fruit {
String name;
int calory;
int price;
String color;
public Fruit(String name, int calory, int price, String color) {
	super();
	this.name = name;
	this.calory = calory;
	this.price = price;
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCalory() {
	return calory;
}
public void setCalory(int calory) {
	this.calory = calory;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Fruit [name=" + name + ", calory=" + calory + ", price=" + price
			+ ", color=" + color + "]";
}

}
