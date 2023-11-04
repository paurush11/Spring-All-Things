package com.firstproject.firstproject.BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {11,12,13,14,15};
	}

}
