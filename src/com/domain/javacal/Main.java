package com.domain.javacal;

public class Main {

	public static void main(String[] args) {
		CalculatorJava cal= new CalculatorJava();
		int sumNum=cal.sum(10, 10);
		System.out.println(sumNum);
		
		System.out.println(cal.subtract(10, 8));
		
		System.out.println(cal.multiply(2, 2));
	}

}
