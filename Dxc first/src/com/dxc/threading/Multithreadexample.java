package com.dxc.threading;

public class Multithreadexample implements Runnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread("First Thread");
		Thread thread2 = new Thread("Second Thread");
		Thread thread3=new Thread(new Multithreadexample());
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Thread names are as following\n\n"+thread1.getName()+"\n"+thread2.getName());
	}

	@Override
	public void run() {
		System.out.println("Hi i am a run method");
	}

}

