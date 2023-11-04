package com.firstproject.firstproject.MatrixCalculatorService;

import java.util.Arrays;

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
			Arrays.stream(resultContext.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(resultContext.getBean(MatrixCalculatorService.class).result());
		}

	}

}
