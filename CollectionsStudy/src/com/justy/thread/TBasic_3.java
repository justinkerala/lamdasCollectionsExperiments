package com.justy.thread;

public class TBasic_3 {

	//Thread by implementing runnable interface//
	//Thread names.
	
public static void main(String[] args) {
	myRunnable m=new myRunnable();
	
Thread.currentThread().setPriority(8);	
	
	Thread t=new Thread(m);
	
 	t.start();
 	

	Thread t1=new Thread(m);
	
 	t1.start();

 	Thread.currentThread().setName("JUSTIN MATHEW");
 	
//t.start(); illegal state exception.
}

}



class myRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Child Thread priority "+Thread.currentThread().getPriority());
	}}
