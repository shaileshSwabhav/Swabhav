package com.techlab.dipsolution;

public class TaxCalculation {

	ILogable logType;
	
	public TaxCalculation(ILogable log) {
		this.logType = log;
	}

	public ILogable getLog() {
		return logType;
	}
	
	public int calculate(int amount, int rate) {
		
		try {
			int r = amount / rate;
			return r;
		} catch (Exception e) {
			this.logType.log(e.getMessage());
			return -1;
		}
	}
	
}
