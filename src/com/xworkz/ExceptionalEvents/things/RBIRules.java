package com.xworkz.ExceptionalEvents.things;

public class RBIRules {
	private CanaraBank canaraBank;
	

	public RBIRules() {
		System.out.println("Default Constructor");
	}
	
	public RBIRules(CanaraBank canaraBank) {
		this.canaraBank=canaraBank;
		System.out.println("Parameterized Constructor");
	}
	
	public void check() {
		if (canaraBank != null) {
			long duddu = this.canaraBank.maxAmount();
			double duddu1 = this.canaraBank.minAmount();
			if(duddu==25000 && duddu1==10000) {
				System.out.println("following the rules");
			}
			else
				System.out.println("not following the rules");
		}
		
	}
}
