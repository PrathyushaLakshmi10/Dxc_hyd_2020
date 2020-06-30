package com.dxc.studentfee;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Accountant {
	boolean anotherstudent=true;
	String name,email,course,Fee,Due,Paid,address,city,state,country;	
	int phone;
public void addstudent(BufferedReader ObjBufferedReader,Connection connection)
{
	try
		{
			System.out.println("Enter the details of the student");
			System.out.println("Enter the name of the student");
			name=ObjBufferedReader.readLine();
			System.out.println("Enter the email of the student");
			email=ObjBufferedReader.readLine();
			System.out.println("Enter the course of the student");
			course=ObjBufferedReader.readLine();
			System.out.println("Enter the total fee of the student");
			int fee=Integer.parseInt(ObjBufferedReader.readLine());
			System.out.println("Enter the paid fee of the student");
			int paid=Integer.parseInt(ObjBufferedReader.readLine());
			int due=fee-paid;
			Fee=Integer.toString(fee);
			Paid=Integer.toString(paid);
			Due=Integer.toString(due);
			System.out.println("remaining due of the student: "+Due);
			System.out.println("Enter the address of the student");
			address=ObjBufferedReader.readLine();
			System.out.println("Enter the city of the student");
			city=ObjBufferedReader.readLine();
			System.out.println("Enter the state of the student");
			state=ObjBufferedReader.readLine();
			System.out.println("Enter the country of the student");
			country=ObjBufferedReader.readLine();
			System.out.println("Enter the phone number of the student");
			phone=Integer.parseInt(ObjBufferedReader.readLine());
			PreparedStatement stmtInsert = connection.prepareStatement("insert into studentdb values(?,?,?,?,?,?,?,?,?,?,?)");
			stmtInsert.setString(1,name);
			stmtInsert.setString(2,email);
			stmtInsert.setString(3,course);
			stmtInsert.setString(4,Fee);
			stmtInsert.setString(5,Paid);
			stmtInsert.setString(6,Due);
			stmtInsert.setString(7,address);
			stmtInsert.setString(8,city);
			stmtInsert.setString(9,state);
			stmtInsert.setString(10,country);
			stmtInsert.setInt(11,phone);
			System.out.println(stmtInsert.executeUpdate()+"records inserted");
			
		
	    }
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
public void viewstudent(BufferedReader ObjBufferedReader,Connection connection)
{
	try
	{
		Statement stmt = connection.createStatement(); 
		ResultSet rs =   stmt.executeQuery("select * from studentdb");
		while (rs.next())
			System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)
			+ ", " + rs.getString(5)+", " + rs.getString(6)+", " + rs.getString(7)+", " + rs.getString(8)+", " + rs.getString(9)+", " + rs.getString(10)+", " + rs.getInt(11));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void editstudent(BufferedReader ObjBufferedReader,Connection connection)
{
	try
	{
		name=ObjBufferedReader.readLine();
		email=ObjBufferedReader.readLine();
		PreparedStatement stmtUpdate = connection.prepareStatement("update studentdb set name=? where email=?");
		stmtUpdate.setString(1, name); 
		stmtUpdate.setString(2,email ); 
		System.out.println(stmtUpdate.executeUpdate() + " No of Records Updated");
	
    }
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void duefees(BufferedReader ObjBufferedReader,Connection connection)
{ 
	try
	{
		Statement Objstmt = connection.createStatement(); 
		name=ObjBufferedReader.readLine();
		ResultSet Objrs =  Objstmt.executeQuery("select due from studentdb where name='"+name+"'" );
		while(Objrs.next())
			System.out.println("the due amount is: "+Objrs.getString(1));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}