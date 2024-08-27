package com.mycompany.app;

public class Recursion {
	long factorial(long number) {
		if(number <= 1) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
	}
}
