package com.firstproject.firstproject.MatrixCalculatorService.prototypeVsSingleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MatrixCalculatorServiceLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				var resultContext = new AnnotationConfigApplicationContext(MatrixCalculatorServiceLauncher.class)) {
			
			System.out.println(resultContext.getBean(MatrixCalculatorService.class).result());
			System.out.println(resultContext.getBean(MatrixCalculatorService.class));
			System.out.println(resultContext.getBean(MatrixCalculatorService.class));
			System.out.println(resultContext.getBean(MatrixCalculatorService.class));
			
			System.out.println("\n\n\n\n");
			System.out.println(resultContext.getBean(PerformOperation.class));
			System.out.println(resultContext.getBean(PerformOperation.class));
			System.out.println(resultContext.getBean(PerformOperation.class));
			System.out.println(resultContext.getBean(PerformOperation.class));
	
			
		}

	}

}
