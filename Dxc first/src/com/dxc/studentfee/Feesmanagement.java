package com.dxc.studentfee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.*;
class MyLogin <T> 
{ 
	T obj;
	
void create(T obj) 
{ 
	this.obj = obj;
}
T getInstance()
{ 
	return obj;
}
}
public class Feesmanagement 
{
	InputStreamReader ObjInputstreamreader=null;
	BufferedReader ObjBufferedReader=null;
	Accountant Objaccountant=null;
	Admin Objadmin=null;
	boolean loginchoice=true;
	Connection Objconnection;
	public Connection getInstance() throws ClassNotFoundException, SQLException
	{
		if(Objconnection==null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Objconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "saiprathyusha@1910");
			 return Objconnection;
		}
		else
		return Objconnection;
		
	}
public static void main(String[] args) throws Exception
{ 
	Feesmanagement Objfeesmanagement=new Feesmanagement();
	try {
	
	Objfeesmanagement.ObjBufferedReader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("select the login choice:\n1.Admin \n2.Accountant");
	String loginby=Objfeesmanagement.ObjBufferedReader.readLine();	
	boolean anotherchoice=true;
	do 
	{
		switch(Integer.parseInt(loginby))
		{	
			case 1:	MyLogin<Admin> obj=new MyLogin<Admin>();
					obj.create(new Admin());
					Objfeesmanagement.Objadmin=obj.getInstance();
					System.out.println("Enter the login details of admin");
					System.out.println("Enter the username:");
					String username=Objfeesmanagement.ObjBufferedReader.readLine();
					System.out.println("Enter the Password");
					String password=Objfeesmanagement.ObjBufferedReader.readLine();
					do
					{
						System.out.println("select the following selection \n1.addaccountant \n2.viewaccountant \n3.logout");
						String adminchoice=Objfeesmanagement.ObjBufferedReader.readLine();
						switch(Integer.parseInt(adminchoice))
						{
						case 1:	Objfeesmanagement.Objadmin.addaccountant(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 2: Objfeesmanagement.Objadmin.viewaccountant(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 3:	System.out.println("Your account was logged out successfully");
					 			break;
						default:
							System.out.println("No Operation Choice Selected");		
						}
						System.out.println("Select if you want perform another choice \nYes \nNo");
						String addanotheracc=Objfeesmanagement.ObjBufferedReader.readLine();
						if(addanotheracc.equalsIgnoreCase("No"))
							anotherchoice=false;
					}while(anotherchoice);	
					break;
			case 2: MyLogin<Accountant> obj1=new MyLogin<Accountant>();
					obj1.create(new Accountant());
					Objfeesmanagement.Objaccountant=obj1.getInstance();
					System.out.println("Enter the student details ");
					do
					{
						System.out.println("select the following selection \n1.addstudent \n2.viewstudent \n3.editstudent \n4.duefees \n5.logout");
						String adminchoice=Objfeesmanagement.ObjBufferedReader.readLine();
						switch(Integer.parseInt(adminchoice))
						{
						case 1: Objfeesmanagement.Objaccountant.addstudent(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 2:Objfeesmanagement.Objaccountant.viewstudent(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 3:Objfeesmanagement.Objaccountant.editstudent(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 4:Objfeesmanagement.Objaccountant.duefees(Objfeesmanagement.ObjBufferedReader,Objfeesmanagement.getInstance());
								break;
						case 5:System.out.println("your account was logged out successfully");
								break;
						default:
							System.out.println("No Operation Choice Selected");	
						}
						System.out.println("Select if you want perform another choice \nYes \nNo");
						String addanotheracc=Objfeesmanagement.ObjBufferedReader.readLine();
						if(addanotheracc.equalsIgnoreCase("No"))
		    						anotherchoice=false;
					}while(anotherchoice);
			
		}
	    System.out.println("Do you want to continue with login choice \nYes \nNo");
	    String logchoice=Objfeesmanagement.ObjBufferedReader.readLine();
	    if(logchoice.equalsIgnoreCase("No"))
	    	Objfeesmanagement.loginchoice=false;
	     
	}while(Objfeesmanagement.loginchoice);	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
    finally
    {
   			Objfeesmanagement.ObjBufferedReader.close();	
		
    }
}
}
