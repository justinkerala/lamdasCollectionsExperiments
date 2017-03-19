package com.justy.thread;

public class TBasic_4 {

	
	
	public static void main(String[] args) {
		
		
		
		myThreadClass m=new myThreadClass();
		m.setPriority(10);
		m.start();
Thread.currentThread().setPriority(1);
		
for(int i=0;i<10;i++)
{
System.out.println("====>>>In main Thread");	
}

	}
	
	
	
}


class myThreadClass extends Thread
{
	
@Override
public void run() {

for(int i=0;i<10;i++)
{
System.out.println("====>>>In child Thread");	
}

}
}