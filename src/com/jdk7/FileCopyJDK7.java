package com.jdk7;

import java.io.*;
//Copy from one file to another file character by character.
//JDK 7 has a try-with-resources statement, which ensures that
//each resource opened in try() is closed at the end of the statement.
//try-with-resources

public class FileCopyJDK7 {
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader("src\\resources\\in.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("src\\resources\\out.txt"))) {
			int charRead;
			while ((charRead = in.read()) != -1) {
				System.out.printf("%c ", (char) charRead);
				out.write(charRead);
			}
		} catch (IOException  ex) {
			ex.printStackTrace();
		}
	}
}