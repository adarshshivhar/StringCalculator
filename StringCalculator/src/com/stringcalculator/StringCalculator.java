package com.stringcalculator;

public class StringCalculator {

	public int add(String input) {
		if(input.equals("")) {
			return 0;
		}else {
			int total = 0;
			String delimiter = ",";
			if(input.matches("//(.*)\n(.*)")) {
				delimiter = Character.toString(input.charAt(2));
				input = input.substring(4);
			}
			
			String[] numbers = input.split(delimiter + "|\n");
			
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
