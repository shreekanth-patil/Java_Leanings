package com.jdk7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java7MultiCatch {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		try {
			BufferedReader br1 = new BufferedReader(new FileReader("E://test.txt"));
			String str = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1565:myDB");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Multi catch block here!");
			e.printStackTrace();
		}

	}
}
