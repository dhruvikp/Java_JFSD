package com.simplilearn.threads;

public class InterthreadCommunicationExample {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		new Thread() {
			public void run( ) {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run( ) {
				c.deposit(10000);
			}
		}.start();
		

	}

}




class Customer {
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw..");
		
		if(this.amount < amount) {
			System.out.println("Less balance, waiting for deposit...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw completed..");
	}
	
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		this.amount += amount;
		System.out.println("Deposit completed");
		notify();
	}
	
	
	
}
