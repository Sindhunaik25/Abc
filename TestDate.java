package com.sindhu.service.support;

import com.sindhu.service.support.TestdateRecord;
import com.sindhu.service.DateDifferenceProvider;
import com.sindhu.service.MyDate;

public class TestDate {
	public static void main(String[] args) {
	DateDifferenceProvider dateDifferenceProvider=new DateDifferenceProvider();
	TestdateRecord[] records=new TestdateRecord[13];
	records[0]=new TestdateRecord(new MyDate(20, 11, 2018),new MyDate(20, 11, 2018),0);
	records[1]=new TestdateRecord(new MyDate(20, 11, 2018),new MyDate(22, 11, 2018),2);
	records[2]=new TestdateRecord(new MyDate(20, 11, 2018),new MyDate(5, 12, 2018),15);
	records[3] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
	records[4] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
	records[5] = new TestdateRecord(new MyDate(06, 04, 2013), new MyDate(18, 12, 2014), 621);
	records[6] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987);
	records[7] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);
	records[8] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);
	records[9] = new TestdateRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);
	records[10] = new TestdateRecord(new MyDate(06, 01, 2011), new MyDate(6, 3, 2011), 59);
	records[11] = new TestdateRecord(new MyDate(06, 02, 2012), new MyDate(6, 3, 2012), 29);
	records[12] = new TestdateRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);
	//records[13] = new TestdateRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);
	
	for (int index=0; index < records.length; index++) {
		int calculatedDiff = dateDifferenceProvider.calDateDifference(records[index].getStartDate(),records[index].getEndDate());
		if (calculatedDiff == records[index].getActualDiff()) {
			System.out.println("Test Case passed:"+" Actual difference = " + records[index].getActualDiff()+ " calculated difference = "+ calculatedDiff);
		} else {
			System.err.println("Test Case failed"+" Actual difference = " + records[index].getActualDiff()+ " calculated difference = "+ calculatedDiff);
		}
	}
}
	
	

}
