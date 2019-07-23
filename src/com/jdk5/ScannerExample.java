package com.jdk5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author shreekanth
 * 
 *         The java.util.Scanner class can be used to convert text into
 *         primitives or Strings.
 * 
 */
public class ScannerExample {

	public static void readFromFile(String inputFile) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(inputFile));

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
		scanner.close();
	}

	public static void readFromString(String inputString) {
		Scanner scanner = new Scanner(inputString);

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		scanner.close();
	}
	
	
	public static void readFromStringAsTokens(String str) {
		
		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(str);

		System.out.println();
		// find the next token and print it
		System.out.println("" + scanner.next());

		// find the next token and print it
		System.out.println("" + scanner.next());

		// close the scanner
		scanner.close();
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		ScannerExample.readFromFile("E:\\SPatil\\Java\\workspace\\Java_Leanings\\src\\com\\jdk5\\inputFile.txt");
		
		System.out.println();
		
		ScannerExample.readFromString("This is a sample string that is about to be scanned!");
		
		String s = "Hello World! 3 + 3.0 = 6 ";
		
		ScannerExample.readFromStringAsTokens(s);
		
		
	}
}
