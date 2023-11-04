package com.firstproject.firstproject.MatrixCalculatorService;

import org.springframework.stereotype.Component;

@Component
public class LeftSideFirst implements MatrixResult {

	@Override
	public int printResult(int[][] matrix) {

		return matrix[0][0];
	}

}
