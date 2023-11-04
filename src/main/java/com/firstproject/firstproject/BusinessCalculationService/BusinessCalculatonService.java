package com.firstproject.firstproject.BusinessCalculationService;

import java.util.Arrays;


import org.springframework.stereotype.Component;

@Component

public class BusinessCalculatonService {

	private DataService dataservice;
	
	public int findMax() {
		return Arrays.stream(dataservice.retriveData()).max().orElse(0);
	
	}
	
	public BusinessCalculatonService(DataService dataService) {
		super();
		this.dataservice = dataService;
	}


}
