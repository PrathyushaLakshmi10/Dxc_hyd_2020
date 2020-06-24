package comdxc.firstapp;
import java.util.*;
public class GenericsExample {
	public static void main(String[] args) {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Rohan");
		mList.add("Sohan");
		mList.add("prathyusha");
		mList.add("1");
		String s = mList.get(2);// type casting is required here
		int i=Integer.parseInt(mList.get(3));
		System.out.println(i);
	System.out.println(s);
	}
}
