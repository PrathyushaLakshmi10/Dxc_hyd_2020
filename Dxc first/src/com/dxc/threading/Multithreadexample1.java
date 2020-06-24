package com.dxc.threading;

public class Multithreadexample1 extends Thread {
public void run() {
	for(int i=0; i<5; i++) {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println("Exception is "+e);
		}
		System.out.println(i);
	}
}

public static void main(String[] args) {
	Multithreadexample1 mt1 = new Multithreadexample1();
	Multithreadexample1 mt2 = new Multithreadexample1();
	
	mt1.start();
	mt2.start();
}
}