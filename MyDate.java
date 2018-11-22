package com.sindhu.service;

public class MyDate {

public MyDate(int dd,int mm,int yyyy)
{
	this.dd=dd;
	this.mm=mm;
	this.yyyy=yyyy;
}
private int dd;
public int getDd() {
	return dd;
}
public void setDd(int dd) {
	this.dd = dd;
}
public int getMm() {
	return mm;
}
public void setMm(int mm) {
	this.mm = mm;
}
public int getYyyy() {
	return yyyy;
}
public void setYyyy(int yyyy) {
	this.yyyy = yyyy;
}
private int mm;
private int yyyy;
}
