package com.onkar.service.supp;

public class MyTestRecord {
	
	MyDate startDate;
	MyDate endDate;
	int actualDiffernce;
	
	public MyTestRecord(MyDate startDate, MyDate endDate, int actualDiffernce) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.actualDiffernce = actualDiffernce;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}

	public MyDate getEndDate() {
		return endDate;
	}

	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}

	public int getActualDiffernce() {
		return actualDiffernce;
	}

	public void setActualDiffernce(int actualDiffernce) {
		this.actualDiffernce = actualDiffernce;
	}
	
	
	
	

}
