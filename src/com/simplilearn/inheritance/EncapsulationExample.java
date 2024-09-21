package com.simplilearn.inheritance;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		cpu.setRAM(8);	
		
		cpu.getRam();
		
	}

}


class CPU {
	private int ram;
	
	public void setRAM(int ram) {
		this.ram  = ram;
	}
	
	public void getRam() {
		System.out.println("RAM size :"+ this.ram);
	}
}