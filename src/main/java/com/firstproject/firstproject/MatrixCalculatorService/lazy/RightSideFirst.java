package com.firstproject.firstproject.MatrixCalculatorService.lazy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RightSideFirst implements MatrixResult {
	
	public RightSideFirst () {
		
		System.out.println("\n\n\nRight Class is Initialized");
	}

	@Override
	public int printResult(int[][] matrix) {
		// TODO Auto-generated method stub
		return matrix[matrix.length-1][matrix[0].length-1];
	}

}
