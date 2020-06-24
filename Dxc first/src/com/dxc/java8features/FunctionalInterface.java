package com.dxc.java8features;


interface Screen {
	public void screenType();
}
public class FunctionalInterface {


	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression
		Screen type = () -> {
			System.out.println("Screen Type is "+screenType);
		};
		type.screenType();
	}
}