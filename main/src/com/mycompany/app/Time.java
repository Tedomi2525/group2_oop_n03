package com.mycompany.app;

public class Time {

	int hour;
	int minute;
	int second;
	
	Time() {setTime(0, 0, 0);}
	Time(int h) {setTime(h, 0, 0);}
	Time(int h, int m) {setTime(h, m, 0);}
	Time(int h, int m, int s){setTime(h, m, s);}
	
	Time setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
		return this;
	}
	
	Time setHour(int h) {
		hour = ((h < 24 && h >= 0) ? h : 0);
		return this;
	}
	
	Time setMinute(int m) {
		minute = ((m>=0 && m < 60)? m : 0);
		return this;
	}
	
	Time setSecond(int s) {
		second = ((s >=0 && s < 60)? s : 0);
		return this;
	}
	
	int getHour() {return hour;}
	int getMinute() {return minute;}
	int getSecond() {return second;}
	
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(20, 3, 45);
		
		t1.setHour(7).setMinute(45).setSecond(10);
		System.out.println("t1 is " +t1);
		System.out.println("t2 is " +t2);
	}
}
