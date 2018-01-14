package com.kru.ck.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
	
	public long whatsTimeInMillis()
	{
		return System.currentTimeMillis();
	}
	
	public Date getDate(Calendar calendar)
	{
		return calendar != null ? calendar.getTime() : null;
	}
	
	public Calendar getCalendar(Date date)
	{
		Calendar cal = null;
		
		if(date != null)
		{
			cal = Calendar.getInstance();
			cal.setTimeInMillis(date.getTime());
		}
		
		return cal;
	}
	
	
	public long getTimeInMillies(Date date)
	{
		return date != null ? date.getTime() : -1;
	}
	
	public long getTimeInMillies(Calendar cal)
	{
		return cal != null ? cal.getTimeInMillis() : -1;
	}
	
	public void testDateFormats()
	{
		try {
		String date = "2017/12/04";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date day1 = formatter.parse(date);
		System.out.println("Valid date format parsed : " + day1);
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("YYYY/MM/DD");
		Date day2 = formatter1.parse(date);
		System.out.println("Invalid date format parsed : " + day2);
		} catch( ParseException e)
		{
			e.printStackTrace();
		}
	
	}
	
	

	public static void main(String[] args){
		TestDates obj = new TestDates();
		obj.testDateFormats();
		
	}

}
