package com.firstproject.firstproject.MatrixCalculatorService.prototypeVsSingleton;

import org.springframework.stereotype.Component;

@Component

public class LeftSideFirst implements MatrixResult {
	public LeftSideFirst () {
		
		System.out.println("\n\n\nLeft Class is Initialized");
	}
	@Override
	public int printResult(int[][] matrix) {

		return matrix[0][0];
	}

}
/// 	IF not used will not be run