package com.designe;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		
		if(planType.equals("domestic")) {
			return new DomesticPlan();
		}
		if(planType.equals("commercial")) {
			return new ComercialPlan();
		}
		return new ComercialPlan();
		
	}
		
}
