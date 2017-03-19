package com.justy.thread;

public class TBasic_5 {

	 
	public static void main(String[] args) {
		YieldThreadExample ex=new YieldThreadExample();
		ex.start();


		 for(int i=0;i<10;i++)
		 {
			 System.out.println("===>Main Thread");
		 }
	}
}


class YieldThreadExample extends Thread

{
	
@Override
public void run() {

 for(int i=0;i<10;i++)
 {
	 System.out.println("===>Child Thread");
	  Thread.yield();
 }
}

}
