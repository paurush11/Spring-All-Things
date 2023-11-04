package com.firstproject.firstproject.MatrixCalculatorService;

import org.springframework.stereotype.Component;

@Component
public class RightSideFirst implements MatrixResult {

	@Override
	public int printResult(int[][] matrix) {
		// TODO Auto-generated method stub
		return matrix[matrix.length-1][matrix[0].length-1];
	}

}
