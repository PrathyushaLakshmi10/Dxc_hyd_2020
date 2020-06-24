package comdxc.firstapp;
import java.io.*;
public class BufferReaderExample
{
public static void main(String[] args) throws Exception {
		InputStreamReader mISR = new InputStreamReader(System.in);
		BufferedReader mBuff = new BufferedReader(mISR);
		
		String name="";
		while(!name.equalsIgnoreCase("exit")) {
		System.out.println("Enter your data Please");
		name = mBuff.readLine();
		System.out.println("Hello "+name);
		}
		mBuff.close();
		mISR.close();
	}
}