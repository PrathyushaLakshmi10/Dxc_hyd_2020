package com.dxc.resultmanagement;
import java.io.*;
import java.util.*;
class MyBranch<T>
{
	T obj;
	void create(T obj) { 
		this.obj = obj;
	}
	
	T getInstance() { 
		return obj;
	}
}
public class College {
	InputStreamReader isr=null;
	BufferedReader buff=null;
	CompSccience cs=null;
	InformTechnology it=null;
	Mechanical mec=null;
	List<Student> mstudentlist=new ArrayList<Student>();
	public static void main(String[] args) throws IOException
	{
		College mcollege=new College();
		mcollege.isr=new InputStreamReader(System.in);
		mcollege.buff=new BufferedReader(mcollege.isr);
		boolean streamcontinue=true;
		boolean  nextstudentdetails=true;
		String continuestudentdetails;
		String otherstream;
		do { 
	        Student mstudent=new Student();
	        System.out.println("Select the Stream of the Candidate");
	        System.out.println("Streams are\n1.CompScciece\n2.InformTechnology\n3.Mechanical");
	        String streamchoice=mcollege.buff.readLine();
	        switch(Integer.parseInt(streamchoice))
	        {
	        case 1:MyBranch<CompSccience> cse=new MyBranch<CompSccience>();
	               cse.create(new CompSccience());
	               mcollege.cs=cse.getInstance();
	               do {
	            	   System.out.println("enter the details");
	            	   mcollege.cs.Studentdetails(mcollege.buff,mstudent);
	            	   System.out.println("Do you want to enter other student details??");
	            	   continuestudentdetails=mcollege.buff.readLine();
	            	   if(continuestudentdetails.equalsIgnoreCase("No"))
	            	   {
	            		   nextstudentdetails=false;
	            	   }
                      
	               }while( nextstudentdetails);
	                mstudent.setStreamtype("CompSccience");
	                break;
	        case 2: MyBranch<InformTechnology> ite=new MyBranch<InformTechnology>();
                    ite.create(new InformTechnology());
                    mcollege.it=ite.getInstance();
                    do
                    {
                    	System.out.println("enter the details");
                    	mcollege.it.Studentdetails(mcollege.buff,mstudent);
                    	System.out.println("Do you want to enter other student details??");
                    	continuestudentdetails=mcollege.buff.readLine();
                    	if(continuestudentdetails.equalsIgnoreCase("No"))
                    	{
                    		nextstudentdetails=false;
                    	}
           
                    }while( nextstudentdetails);
                    mstudent.setStreamtype("InformTechnology");
                    break;
	        case 3:MyBranch<Mechanical> me=new MyBranch<Mechanical>();
                   me.create(new Mechanical());
                   mcollege.mec=me.getInstance();
                   do
                   {
                	   System.out.println("enter the details");
                	   mcollege.mec.Studentdetails(mcollege.buff,mstudent);
                	   System.out.println("Do you enter other student details??");
                	   continuestudentdetails=mcollege.buff.readLine();
                	   if(continuestudentdetails.equalsIgnoreCase("No"))
                	   {
                		   nextstudentdetails=false;
                	   }
           
                   }while( nextstudentdetails);
                   mstudent.setStreamtype("Mechanical");
                   break;        
            default:
            	System.out.println("no stream selected");
	        }
	        System.out.println("Do you enter the details of other streams students");
	        otherstream=mcollege.buff.readLine();
	        if(otherstream.equalsIgnoreCase("No"))
	        {
	        	streamcontinue=false;
	        }
	        mcollege.mstudentlist.add(mstudent);
	       }while(streamcontinue);
	    	System.out.println(" Total no.of students are"+mcollege.mstudentlist.size());
	    	System.out.println("-----------Below are student details-----------");
	    	for(Student s:mcollege.mstudentlist)
	    	{
	    		System.out.println("\nstudent details are\nStudent stream: "+s.getStreamtype() +"\nname of the student:"+s.getName()+"\nRoll no of the student:"+s.getRollno()+"\nYear of the student:"+s.getYear()+"\nstudent total marks:"+s.getTotalmarks());
	    	}
         
	}
}
