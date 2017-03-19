package com.justy.thread;


//illegal state exception 
public class TBasic_2 {

	
	
	public static void main(String[] args) {
		child t=new child();
		t.start();
		t.start();
	}
	
}
 class child extends Thread{
	 @Override
	public void run() {

		 for(int i=0;i<100;i++)
		 {
			 System.out.println("child");
		 }
		 
	}
 }