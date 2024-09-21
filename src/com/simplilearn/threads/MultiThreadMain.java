package com.simplilearn.threads;

public class MultiThreadMain {

	public static void main(String[] args) throws InterruptedException {
		Multi1 runnableObj = new Multi1();
		Thread thread1  = new Thread(runnableObj);
		thread1.start();
		
		thread1.join();
		
		Thread thread2 =new Thread(runnableObj);
		thread2.start();
	}

}

class Multi1 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+ " - "+i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
