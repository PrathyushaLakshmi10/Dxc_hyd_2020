package com.dxc.studentfee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.io.*;
class MyLogin <T> { 
	T obj;
	
	void create(T obj) { 
		this.obj = obj;
	}
	
	T getInstance() { 
		return obj;
	}
}
public class Feesmanagement {
	InputStreamReader isr=null;
	BufferedReader buf=null;
	Accountant accountant=null;
	Admin admin=null;
	boolean loginchoice=true;
public static void main(String[] args) throws Exception
{ 
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "saiprathyusha@1910");
	Feesmanagement fmg=new Feesmanagement();
	fmg.buf=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("select the login choice:\n1.Admin \n2.Accountant");
	String loginby=fmg.buf.readLine();
	
	boolean anotherchoice=true;
	do 
	{
		switch(Integer.parseInt(loginby))
		{
	
			case 1:	MyLogin<Admin> obj=new MyLogin<Admin>();
					obj.create(new Admin());
					fmg.admin=obj.getInstance();
					System.out.println("Enter the login details of admin");
					System.out.println("Enter the username:");
					String username=fmg.buf.readLine();
					System.out.println("Enter the Password");
					String password=fmg.buf.readLine();
					do
					{
					
						System.out.println("select the following selection \n1.addaccountant \n2.viewaccountant \n3.logout");
						String adminchoice=fmg.buf.readLine();
						switch(Integer.parseInt(adminchoice))
						{
					 
						case 1:	fmg.admin.addaccountant(fmg.buf);
								break;
						case 2: fmg.admin.viewaccountant(fmg.buf);
								break;
						case 3:	System.out.println("Your account was logged out successfully");
					 			break;
						default:
							System.out.println("No Operation Choice Selected");		
						}
						System.out.println("Select if you want perform another choice \nYes \nNo");
						String addanotheracc=fmg.buf.readLine();
						if(addanotheracc.equalsIgnoreCase("No"))
							anotherchoice=false;
					}while(anotherchoice);	
					break;
			case 2: MyLogin<Accountant> obj1=new MyLogin<Accountant>();
					obj1.create(new Accountant());
					fmg.accountant=obj1.getInstance();
					System.out.println("Enter the student details ");
					do
					{
						System.out.println("select the following selection \n1.addstudent \n2.viewstudent \n3.editstudent \n4.duefees \n5.logout");
						String adminchoice=fmg.buf.readLine();
						switch(Integer.parseInt(adminchoice))
						{
						case 1: fmg.accountant.addstudent(fmg.buf);
								break;
						case 2:fmg.accountant.viewstudent(fmg.buf);
								break;
						case 3:fmg.accountant.editstudent(fmg.buf);
								break;
						case 4:fmg.accountant.duefees(fmg.buf);
								break;
						case 5:System.out.println("your account was logged out successfully");
								break;
						default:
							System.out.println("No Operation Choice Selected");	
						}
						System.out.println("Select if you want perform another choice \nYes \nNo");
						String addanotheracc=fmg.buf.readLine();
						if(addanotheracc.equalsIgnoreCase("No"))
		    						anotherchoice=false;
					}while(anotherchoice);
			
		}
	     System.out.println("Do you want to continue with login choice \nYes \nNo");
	     String logchoice=fmg.buf.readLine();
	     if(logchoice.equalsIgnoreCase("No"))
	    	fmg.loginchoice=false;
	     
	}while(fmg.loginchoice);		
	
	}
	

	
	
}
