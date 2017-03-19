package com.justy.thread;

public class TBasic_1 {

	//Main thread took more time than the child
	//this reflects in the console
	public static void main(String[] args) {
		
		ChildThread t=new ChildThread();
		
		t.start();
	
		for(int i=0;i<100;i++)
		{
			System.out.println("Parent"+i);
			try{
			Thread.sleep(10);
			}catch (InterruptedException e) {
             e.printStackTrace();
			}
		}
		
	}
}


class ChildThread extends Thread
{
	
@Override
public void run() {

	for(int i=0;i<100;i++)
	{
		System.out.println("Child"+i);
		try{
			Thread.sleep(5);
			}catch (InterruptedException e) {
             e.printStackTrace();
			}
	}
	
}
}