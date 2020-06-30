package com.dxc.json;
import java.io.*;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Jsonexample
{
public static void main(String args[]) throws Exception 
{
	File Objfile=new File("C:\\Users\\patti\\Downloads\\example_2.json");
	FileReader Objfr=new FileReader(Objfile);
	JSONParser ObjJsonparser=new JSONParser();
	JSONObject Objjson= (JSONObject)ObjJsonparser.parse(Objfr);
	String quiz=(String) Objjson.get("quiz");
	System.out.println("quiz  is: "+quiz);
	String sport=(String) Objjson.get("sport");
	System.out.println("quiz type is: "+sport);
	String sq1=(String) Objjson.get("q1");
	System.out.println("question number: "+sq1);
	String squestion=(String) Objjson.get("question");
	System.out.println("question is: "+squestion);
	JSONArray mJsonArray = (JSONArray) Objjson.get("options");
	for(int i=0;i<=mJsonArray.size();i++)
	{	
		System.out.println("options is"+mJsonArray.get(i));
	}
	String sanswer=(String) Objjson.get("answer");
	System.out.println("sports question answer is: "+sanswer);
	String maths=(String) Objjson.get("maths");
	System.out.println("quiz type is: "+maths);
	String mq1=(String) Objjson.get("q1");
	System.out.println("question number is: "+mq1);
	String mquestion=(String) Objjson.get("question");
	System.out.println("question is: "+mquestion);
	JSONArray JsonArray = (JSONArray) Objjson.get("options");
	for(int i=0;i<=JsonArray.size();i++)
	{	
		System.out.println("options is"+JsonArray.get(i));
	}
	String manswer=(String) Objjson.get("answer");
	System.out.println("sports question answer is: "+manswer);
	String mq2=(String) Objjson.get("q1");
	System.out.println("question number is: "+mq1);
	String mquestion2=(String) Objjson.get("question");
	System.out.println("question is: "+mquestion2);
	JSONArray mJsonArray2 = (JSONArray) Objjson.get("options");
	for(int i=0;i<=mJsonArray2.size();i++)
	{	
		System.out.println("options is"+mJsonArray2.get(i));
	}
	String manswer2=(String) Objjson.get("answer");
	System.out.println("sports question answer is: "+manswer2);	
	
}
}
