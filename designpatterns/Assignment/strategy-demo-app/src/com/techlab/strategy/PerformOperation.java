package com.techlab.strategy;

public class PerformOperation {

	private OperationStrategy operationStrategy;

	public PerformOperation(OperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public int executeStrategy(int num1, int num2) {
		return operationStrategy.doOperation(num1, num2);
	}

}
