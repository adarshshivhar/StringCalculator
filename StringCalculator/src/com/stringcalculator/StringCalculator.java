package com.stringcalculator;

public class StringCalculator {

	public int add(String input) {
		if(input.equals("")) {
			return 0;
		}else {
			int total = 0;
			String[] numbers = input.split(",|\n");
			for(String s: numbers) {
				total += stringToInteger(s);
			}
			
			return total;
		}
	}

	private int stringToInteger(String s) {
		return Integer.parseInt(s);
	}

}
