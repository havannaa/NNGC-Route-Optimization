package com.nngc.route;

public class DateUtil{
	public static int calculateBirthYear(int age){
		int currentYear = 2023;
		int birthYear = currentYear - age;
		return birthYear;
	}
}
