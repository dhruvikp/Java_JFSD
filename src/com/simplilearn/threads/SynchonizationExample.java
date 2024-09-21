package com.simplilearn.threads;

public class SynchonizationExample {

	public static void main(String[] args) {
		Table t = new Table();

		Thread t1 = new Thread(new Multi2(t, 5));
		t1.start();

		Thread t2 = new Thread(new Multi2(t, 6));
		t2.start();

	}

}

class Table {

	void printTable(int n) {
		
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(n + " X " + i + " = " + n * i);
			}
		}

	}
}

class Multi2 implements Runnable {

	Table t;
	int n;

	Multi2(Table t, int n) {
		this.t = t;
		this.n = n;
	}

	@Override
	public void run() {
		t.printTable(n);
	}

}
