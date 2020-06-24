package com.dxc.java8features;

import java.util.*;

class Printers {
	int id;
	String name;
	float price;
	public Printers(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
		// ArrayList Created of Type Printers Objects
		List<Printers> mList = new ArrayList<Printers>();
		
		mList.add(new Printers(1, "Hp LaserJet", 25000f));
		mList.add(new Printers(3, "KeyInkJet", 15000f));
		mList.add(new Printers(2, "DryInkjet", 5000f));
		mList.add(new Printers(4, "DryInkjet", 15000f));
		
		System.out.println("Sorting the Data on the basis of product name");
		
		// implementing Lambda Expressions
		Collections.sort(mList,(p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
		for(Printers p: mList) {
			System.out.println(p.id+", "+p.name+", "+p.price);
		}
	}
}