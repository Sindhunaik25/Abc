package com.sindhu.service;

public class DateDifferenceProvider {
	//private static final int FEB_LEAP= 2;
	/*private static final int DAY_IN_A_LEAP_YEAR = 366;
	private static final int DAY_IN_A_NON_LEAP_YEAR = 365;*/
	static final int JAN = 31;
	static final int FEB = 28;
	static final int MAR = 31;
	static final int APR = 30;
	static final int MAY = 31;
	static final int JUN = 30;
	static final int JUL = 31;
	static final int AUG = 31;
	static final int SEP = 30;
	static final int OCT = 31;
	static final int NOV = 30;
	static final int DEC = 31;
	int[] months = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };
public int calDateDifference(MyDate startDate,MyDate endDate)
{
	if (sameDate(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
		return 0;
	} else if (sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
		return endDate.getDd() - startDate.getDd();
	} else if (sameYear(startDate, endDate)) {
		return remainingDaysOfMonth(startDate) + daysInIntervingMonth(startDate, endDate) + endDate.getDd()+leapMonth(startDate, endDate);
	} else {
		return remainingDaysOfMonth(startDate) + remainingDaysInYear(startDate) + leadingYear(endDate)
				+ daysInInterveningYear(startDate, endDate)+leapYear(startDate, endDate);
	}

}

private boolean sameDate(MyDate startDate, MyDate endDate) {
	return endDate.getDd() == startDate.getDd();
}

private boolean sameMonth(MyDate startDate, MyDate endDate) {
	return endDate.getMm() == startDate.getMm();
}

private boolean sameYear(MyDate startDate, MyDate endDate) {
	return endDate.getYyyy() == startDate.getYyyy();
}

private int remainingDaysOfMonth(MyDate date) {
	return months[date.getMm() - 1] - date.getDd();
}

private int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
	int totalDays = 0;
	for (int index = startDate.getMm() + 1; index < endDate.getMm(); index++) {
		totalDays += months[index - 1];
	}
	return totalDays;

}

private int daysInInterveningYear(MyDate startDate, MyDate endDate) {

	int remainingdays = 0;

	for (int year = startDate.getYyyy() + 1; year < endDate.getYyyy(); year++) {

		remainingdays = remainingdays + 365;
	}

	return remainingdays;
}

private int remainingDaysInYear(MyDate startDate) {

	int daysRemaining = 0;

	for (int index = startDate.getMm() + 1; index <= 12; index++) {
		daysRemaining = daysRemaining + months[index - 1];
	}

	return daysRemaining;

}

private int leadingYear(MyDate endDate) {

	int daysRemaining = 0;

	for (int month = 1; month < endDate.getMm(); month++) {
		daysRemaining = daysRemaining + months[month - 1];
	}

	daysRemaining = daysRemaining + endDate.getDd();
	return daysRemaining;
}
private int leapYear(MyDate starDate,MyDate enDate)
{
	int totalDays=0;
	for(int index=starDate.getYyyy();index<=enDate.getYyyy();index++)
	{
		if((index%400)==0||(index%4)==0&&(index%100)!=0)
		{
			totalDays+=1;
		}
		
	}
	return totalDays;
}
private int leapMonth(MyDate stDate,MyDate enDate)
{
	int totaldaysinMonth=0;
	if(stDate.getYyyy()%400==0||stDate.getYyyy()%4==0&&stDate.getYyyy()%100!=0)
	{
		for(int index=stDate.getMm()-1;index<=enDate.getMm();index++)
		{
			if(months[index]==FEB)
			{
				totaldaysinMonth+=1;
			}
		}
	}
	return totaldaysinMonth;	
}
}
