package com.dxc.java8features;

interface Scren {
	public String screentype();
}
public class Functionalinterface2 {
	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression
		Scren type = () -> {
			return "Screen Type is "+screenType;
		};
		System.out.println(type.screentype());
	}
}