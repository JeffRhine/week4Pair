package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws Exception{
		
		File inputFile = new File("/Users/christophermeigs/workspace/exercises/m1-w4d2-file-io-part1-exercises/alices_adventures_in_wonderland.txt");
		System.out.println(inputFile.exists());
		
		try(Scanner input = new Scanner(inputFile)) {
			int answer = 0;
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String [] parts = line.split("[\\!\\.\\?]");
					answer += parts.length - 1;
					}
					System.out.println(answer);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
		
		try(Scanner inputW = new Scanner(inputFile)) {
			int answer = 0;
			while(inputW.hasNextLine()) {
				String line = inputW.nextLine();
				String [] parts = line.split("[\\s\\d\\W]+");
					answer += parts.length - 1;
					}
					System.out.println(answer);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
	
	}
}

