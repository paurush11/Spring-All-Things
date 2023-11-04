package com.firstproject.firstproject.BusinessCalculationService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DataServiceLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var businessDataServiceContext = new AnnotationConfigApplicationContext(DataServiceLauncher.class)){
			
			Arrays.stream(businessDataServiceContext.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(
					businessDataServiceContext.getBean(BusinessCalculatonService.class).findMax()
					
					);
		}

	}

}
