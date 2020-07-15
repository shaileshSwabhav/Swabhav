package com.techlab.strategy.test;

import com.techlab.strategy.*;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PerformOperation context = new PerformOperation(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new PerformOperation(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new PerformOperation(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
