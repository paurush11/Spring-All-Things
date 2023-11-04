package com.firstproject.firstproject.MatrixCalculatorService.prototypeVsSingleton;

import org.springframework.stereotype.Component;

@Component

public class MatrixCalculatorService {

	private int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private MatrixResult matrixResult;
	
	public MatrixCalculatorService(MatrixResult matrixResult) {
		System.out.println("Matrix Class is Run");
		this.matrixResult = matrixResult;
	}
	public int result() {
		return matrixResult.printResult(matrix);
	}

}
