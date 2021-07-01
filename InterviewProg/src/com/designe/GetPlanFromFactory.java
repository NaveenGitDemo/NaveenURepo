package com.designe;

public class GetPlanFromFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String planType="commercial";
		GetPlanFactory factory=new GetPlanFactory();
		Plan pln=factory.getPlan(planType);
		       System.out.println(pln.getRate());
	}

}
