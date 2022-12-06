package com.xworkz.ExceptionalEvents.things;

public  class CanaraBank implements BankRules{

	@Override
	public long maxAmount() {
		System.out.println("running max amount");
		return 25000;
	}

	@Override
	public double minAmount() {
		System.out.println("running min amount");
		return 1000;
	}

}
