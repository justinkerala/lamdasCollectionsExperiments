package com.justy.thread;

public class TBasic_6 {

	
	//notify example.
	public static void main(String[] args) {
		
		Baking bk=new Baking(2000);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
bk.withd(5000);				
			}
		}).start();
		
	
		
new Thread(new Runnable() {
			
			@Override
			public void run() {
bk.withd(7879);				
			}
		}).start();
		
	
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	new Thread(new Runnable() {
			
			@Override
			public void run() {
bk.deposit(50000000);
			}
		}).start();
		
	}
}

 class Baking{
	
	 private int balance;
	 
	 
	 public Baking(int balance) {
		super();
		this.balance = balance;
	}


	synchronized void withd(int amount)
	{
		if(this.balance<amount)
		{
			System.out.println("Less Balance--Waiting to withdraw"+amount);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Waiting completed killing the withdrawal process.");
				e.printStackTrace();
			}
		}
		
		this.balance-=amount;
		System.out.println("withdraw completed for "+amount);
	}
	
	synchronized void deposit(int amount)
	{
		this.balance+=amount;
		System.out.println("Deposited rs."+amount);
		notifyAll();
	}
}