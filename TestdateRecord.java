package com.sindhu.service.support;

import com.sindhu.service.MyDate;

public class TestdateRecord {
	MyDate startDate;
	MyDate endDate;
	public int actualDiff;

	public TestdateRecord(MyDate startDate, MyDate endDate, int actualDiff) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.actualDiff = actualDiff;
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

	public int getActualDiff() {
		return actualDiff;
	}

	public void setActualDiff(int actualDiff) {
		this.actualDiff = actualDiff;
	}

	
}
