package com.dxc.studentfee;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement ;

public class Admin
{	
public void addaccountant(BufferedReader ObjBufferedReader,Connection connection)
{
	try 
    {
		System.out.println("Enter the details of the accountant");
		System.out.println("Enter the id num of the accountant:");
		int id=Integer.parseInt(ObjBufferedReader.readLine());
		System.out.println("Enter the name of the accountant");
		String name=ObjBufferedReader.readLine();
		System.out.println("Enter the password of the accountant");
		String password=ObjBufferedReader.readLine();
		System.out.println("Enter the email of the accountant");
		String email=ObjBufferedReader.readLine();
		System.out.println("Enter the phone number of the accountant");
		String phone=ObjBufferedReader.readLine();	
		PreparedStatement stmtInsert =connection.prepareStatement("insert into accountant values(?,?,?,?,?)");
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
public void viewaccountant(BufferedReader ObjBufferedReader,Connection connection)
{
	try
		{
			Statement Objstmt =connection.createStatement(); 
			ResultSet Objrs =   Objstmt.executeQuery("select * from accountant");
			while (Objrs.next())
				System.out.println(Objrs.getInt(1) + ", " + Objrs.getString(2) + ", " + Objrs.getString(3) + ", " + Objrs.getString(4)
					+ ", " + Objrs.getString(5));
		}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}

