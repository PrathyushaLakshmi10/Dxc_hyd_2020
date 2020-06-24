package com.dxc.java8features;


interface Scrn {
	// function with one parameter
	public String screenType1(String localvariable);
}
public class functioninterface {


	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression: here(typeofscreen) represents the method of the interface
		Scrn type = (typeofscreen) -> {
			return "Screen Type is "+screenType;
		};
		System.out.println(type.screenType1(screenType));
	}
}