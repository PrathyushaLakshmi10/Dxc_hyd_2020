package com.dxc.studentfee;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement ;

public class Admin
{	
	
	public void addaccountant(BufferedReader buff)
	{
		

			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "saiprathyusha@1910");
				System.out.println("Enter the details of the accountant");
				System.out.println("Enter the id num of the accountant:");
				int id=Integer.parseInt(buff.readLine());
				System.out.println("Enter the name of the accountant");
				String name=buff.readLine();
				System.out.println("Enter the password of the accountant");
				String password=buff.readLine();
				System.out.println("Enter the email of the accountant");
				String email=buff.readLine();
				System.out.println("Enter the phone number of the accountant");
				String phone=buff.readLine();
				
				PreparedStatement stmtInsert = con.prepareStatement("insert into accountant values(?,?,?,?,?)");
				stmtInsert.setInt(1,id);
				stmtInsert.setString(2,name);
				stmtInsert.setString(3,password);
				stmtInsert.setString(4,email);
				stmtInsert.setString(5,phone);
				System.out.println(stmtInsert.executeUpdate()+"records inserted");
				
	            
		    
		   }
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public void viewaccountant(BufferedReader buff)
	{
		try
		{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "saiprathyusha@1910");
		Statement stmt = con.createStatement(); 
		ResultSet rs =   stmt.executeQuery("select * from accountant");
		while (rs.next())
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)
				+ ", " + rs.getString(5));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	}

