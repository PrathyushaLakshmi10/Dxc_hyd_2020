package com.dxc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {



public static void main(String[] args) throws Exception {

	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "saiprathyusha@1910");

	// Step 3

	/**********************  Inserting Into DataBase  ***************************/
	PreparedStatement stmtInsert = con.prepareStatement("insert into contact values(?,?,?,?,?)");
	stmtInsert.setInt(1, 2);
	stmtInsert.setString(2, "dhoni");
	stmtInsert.setString(3, "8008399179");
	stmtInsert.setString(4, "dhoni@gmail.com");
	stmtInsert.setString(5, "ranchi");
	System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
}
}