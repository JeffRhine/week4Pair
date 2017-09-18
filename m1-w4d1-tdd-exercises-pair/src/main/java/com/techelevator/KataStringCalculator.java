package com.techelevator;

public class KataStringCalculator {
	
	
	public int add(String numbers) {
		int answer = 0;
		if(numbers == null || numbers.length() == 0) {
			return answer;
		} else {
		String [] parts = numbers.split("[\\s\\D]+");
		for(String part : parts) {
			if(part.equals("")) {
				continue;
			}
			answer += Integer.parseInt(part);
		}
		return answer;
		}
	}
}
