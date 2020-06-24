package com.dxc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {



public static void main(String[] args) throws Exception {

	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractises", "root", "root");

	// Step 3

	/**********************  Inserting Into DataBase  ***************************/
	PreparedStatement stmtInsert = con.prepareStatement("insert into contact values(?,?,?,?,?)");
	stmtInsert.setInt(1, 3);
	stmtInsert.setString(2, "sakshi");
	stmtInsert.setString(3, "949156787");
	stmtInsert.setString(4, "sakshi@gmail.com");
	stmtInsert.setString(5, "up");
	System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
}
}