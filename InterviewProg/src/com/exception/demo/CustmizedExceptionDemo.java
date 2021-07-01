package com.exception.demo;

import java.util.Scanner;

import com.service.TwoOldExceptionService;

public class CustmizedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("plz enter your age ");
		
		Integer age= Integer.parseInt(s.nextLine());
		
		TwoOldExceptionService service=new TwoOldExceptionService();
		try {
		service.getAge(age);
		}catch(TooOldException t) {
			//t.printStackTrace();
			System.out.println(" exception message delegated to main method  message is : " +t.msg);
		}
	/*	if(age>60) {
			throw new TooYoungException("you are too young plz wait you get best match soon ");
		}
		//else if(age<21){
		//	throw new TooOldException("you are too old not get chance ");
//	}
//		else
//			System.out.println("you are young get chance to marry will get mail ");

	}*/
	}

}
