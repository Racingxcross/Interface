package com.xworkz.ExceptionalEvents.boot;

import com.xworkz.ExceptionalEvents.things.CanaraBank;
import com.xworkz.ExceptionalEvents.things.RBIRules;

public class RBIRulesRunner {

	public static void main(String[] args) {
		CanaraBank CanaraBank = new CanaraBank();
		RBIRules rbirules=new RBIRules(CanaraBank);
		rbirules.check();

	}

}
