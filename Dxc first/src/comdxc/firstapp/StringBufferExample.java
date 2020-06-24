package comdxc.firstapp;
import java.lang.*;
import java.util.Scanner;
public class StringBufferExample {
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the data");
	StringBuffer sb=new StringBuffer(sc.nextLine());
    sb.insert(5, "hari");
    System.out.println(sb);

	
}
}
