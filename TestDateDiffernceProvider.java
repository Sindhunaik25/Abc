package com.onkar.test;

import com.onkar.service.DateDifferenceProvider;
import com.onkar.service.supp.MyDate;
import com.onkar.service.supp.MyTestRecord;

public class TestDateDiffernceProvider {
	public static void main(String[] args) {
		DateDifferenceProvider provider = new DateDifferenceProvider();
		MyTestRecord[] myTestRecords = new MyTestRecord[7];
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);
		myTestRecords[2] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
		myTestRecords[3] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
		myTestRecords[4] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
		myTestRecords[5] = new MyTestRecord(new MyDate(06, 04, 2013), new MyDate(18, 12, 2014), 621);
		myTestRecords[6] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987);

		/*
		 * for (MyTestRecord testRecord : myTestRecords) { int calculatedDiff =
		 * DateDifferenceProvider.getDateDifference(testRecord.getStartDate(),
		 * testRecord.getEndDate()); if (calculatedDiff ==
		 * testRecord.getActualDiffernce()) { System.out.println("Test Case passed"); }
		 * else { System.err.println("Test Case failed"); } }
		 */

		for (int index=0; index < myTestRecords.length; index++) {
			int calculatedDiff = provider.getDateDifference(myTestRecords[index].getStartDate(),
					myTestRecords[index].getEndDate());
			if (calculatedDiff == myTestRecords[index].getActualDiffernce()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestRecords[index].getActualDiffernce()+ " calculated ="+ calculatedDiff);
			}
		}
	}

}
