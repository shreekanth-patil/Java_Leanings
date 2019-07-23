package com.jdk7;

import java.io.*;
//Copy from one file to another file character by character.
//Pre-JDK 7 requires you to close the resources using a finally block.

public class FileCopyPreJDK7 {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader("src\\resources\\in.txt"));
			out = new BufferedWriter(new FileWriter("src\\resources\\out.txt"));
			int charRead;
			while ((charRead = in.read()) != -1) {
				System.out.printf("%c ", (char) charRead);
				out.write(charRead);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally { // always close the streams
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		try {
			in.read(); // Trigger IOException: Stream closed
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}