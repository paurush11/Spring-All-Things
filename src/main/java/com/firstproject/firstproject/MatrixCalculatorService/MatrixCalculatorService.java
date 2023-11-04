package com.firstproject.firstproject.MatrixCalculatorService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MatrixCalculatorService {

	private int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private MatrixResult matrixResult;
	
	public MatrixCalculatorService(@Qualifier("rightSideFirst") MatrixResult matrixResult) {
		this.matrixResult = matrixResult;
	}
	public int result() {
		return matrixResult.printResult(matrix);
	}

}
