package com.program.thread;

public class UsingThreadClass extends Thread{
	
	public static void main(String[] args) {
		UsingThreadClass class1 = new UsingThreadClass();
		class1.start();
		for(int i='A';i<'F';i++)
		{
			System.out.println(i);
		}
	}
	
	@Override
	public void run() {
		super.run();
		for(int i=0;i<100;i++){
			System.out.println(i);
		}
	}
}
