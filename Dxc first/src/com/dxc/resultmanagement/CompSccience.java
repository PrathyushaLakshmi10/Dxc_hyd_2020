package com.dxc.resultmanagement;
import java.io.*;
public class CompSccience {
public void Studentdetails(BufferedReader buff,Student student) throws IOException
{
	System.out.println("Enter your Name");
	String name=buff.readLine();
	System.out.println("Enter your RollNo");
	String rollno=buff.readLine();
	System.out.println("Enter your Year");
	String year=buff.readLine();
	student.setname(name);
	student.setRollno(rollno);
	student.setYear(year);
	System.out.println("Enter the marks in the subect1 ");
	String subj1=buff.readLine();
	System.out.println("Enter the marks in the subect2 ");
	String subj2=buff.readLine();
	System.out.println("Enter the marks in the subect3 ");
	String subj3=buff.readLine();
	System.out.println("Enter the marks in the subect4 ");
	String subj4=buff.readLine();
	System.out.println("Enter the marks in the subect5 ");
	String subj5=buff.readLine();
	double sub1=Integer.parseInt(subj1);
	double sub2=Integer.parseInt(subj2);
	double sub3=Integer.parseInt(subj3);
	double sub4=Integer.parseInt(subj4);
	double sub5=Integer.parseInt(subj5);
	double Totalmarks=(((sub1+sub2+sub3+sub4+sub5)*(100))/(500));
	System.out.println("total marks are "+Totalmarks);
    if(Totalmarks >=90)
    {
    	System.out.println("Your Grade is A+");
    }
    else if(Totalmarks>=80 && Totalmarks < 90 )
    {
    	System.out.println("Your Grade is A");
    }
    else if(Totalmarks>=70 && Totalmarks < 80 )
    {
    	System.out.println("Your Grade is B+");
    }
    else if(Totalmarks>=60 && Totalmarks < 70 )
    {
    	System.out.println("Your Grade is B");
    }
    else if(Totalmarks>=50 && Totalmarks < 60 )
    {
    	System.out.println("Your Grade is C+");
    }
    else if(Totalmarks>=40 && Totalmarks < 50 )
    {
    	System.out.println("Your Grade is C");
    }
    else if(Totalmarks<40)
    {
    	System.out.println("Your Grade is F Reattempt the exam");
    }
   
    student.setTotalmarks(Totalmarks);
    
}
	
	
}
	
		


