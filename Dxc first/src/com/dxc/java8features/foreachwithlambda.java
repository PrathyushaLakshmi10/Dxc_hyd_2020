package com.dxc.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class foreachwithlambda {



public static void main(String[] args) {
	List<String> mList = new ArrayList<String>();
	mList.add("Full Smart");
	mList.add("Full HD");
	mList.add("Full Smart Full HD");
	mList.add("Full Smart Full HD with 3D Picture Quality");
	
//	Iterator<String> mIterator = mList.iterator();
//	while(mIterator.hasNext())
//		System.out.println(mIterator.next());
	
	mList.forEach(
			(str)->System.out.println(str)
			);
}
}