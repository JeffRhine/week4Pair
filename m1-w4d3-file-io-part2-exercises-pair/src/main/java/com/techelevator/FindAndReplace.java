package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		
		Scanner inputWord = new Scanner(System.in);
		System.out.println("Please type in a word >>> ");
		String userInput1 = inputWord.nextLine();
		
		System.out.println("Please type in a replacement word >>> ");
		String userInput2 = inputWord.nextLine();
		
		System.out.println("Please type in a file name >>> ");
		String userInput3 = inputWord.nextLine();
		
		System.out.println("Please type in a destination file >>> ");
		String userInput4 = inputWord.nextLine();
		
		File originalAaiw = new File(userInput3);
		File writeOverAaiw = new File(userInput4);
		System.out.println(originalAaiw.exists());
		
		try(
				Scanner newPom = new Scanner(originalAaiw); 
				PrintWriter writePom = new PrintWriter(writeOverAaiw)
		) {
			while(newPom.hasNextLine()) {
				String line = newPom.nextLine();
				if(line.contains(userInput1)) {
					line = line.replace(userInput1, userInput2);
				}
				
				writePom.println(line);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("This is not a file. Try again.");
			System.exit(1);
		} catch(Exception f) {
			System.out.println("Invalid destination. Please try again.");
			System.exit(1);
		}
	}
}
