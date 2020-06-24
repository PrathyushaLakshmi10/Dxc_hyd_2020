package com.dxc.java8features;
interface College {
	University getMessage(String msg);
}

class University {
	University(String msg) {
		System.out.println(msg);
	}
}
public class MethodReferenceExample {
	
	public static void main(String[] args) {
		College mCollege = University::new;
		mCollege.getMessage("University is Bharati Vidyapeeth University, Pune");
	}
}
