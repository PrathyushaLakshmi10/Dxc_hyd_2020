package comdxc.firstapp;
import java.io.*;
public class CharArrayExample {


	// PrintWriter class is used to print objects in text format in text outputstream


		public static void main(String[] args)  throws Exception {
			PrintWriter mPW = new PrintWriter(System.out);
			mPW.write("Hello Welcome to PrintWriter see how it works");
			mPW.flush();
			mPW.close();
		}

	}