package com.stringcalculator;

public class StringCalculator {

	public int add(String input) {
		if(input.equals("")) {
			return 0;
		} else {
			String delimiter = ",";
			if(input.matches("//(.*)\n(.*)")) {
				delimiter = Character.toString(input.charAt(2));
				input = input.substring(4);
			}
			
			String[] numbers = splitStringToNumbers(input, delimiter + "|\n");
			return sum(numbers);
		}
	
	}

	private static int sum(String[] numbers) {
		int total = 0;
		String negativeString = "";
		
		for(String number: numbers) {
			if(stringToInteger(number)<0) {
				if(negativeString.equals("")) {
					negativeString = number;
				}else {
					negativeString += ("," + number);
				}
			}
			
			total += stringToInteger(number);
		
		}
		if(!negativeString.equals("")) {
			throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
		}
		return total;
		
	}

	private static String[] splitStringToNumbers(String input, String string) {

		return input.split(string);
	}

	private static int stringToInteger(String input) {
		
		return Integer.parseInt(input);
	}

}
