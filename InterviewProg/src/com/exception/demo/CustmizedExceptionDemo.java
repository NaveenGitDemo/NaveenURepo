package com.exception.demo;

import java.util.Scanner;

import com.Dao.TooYoungExceptionDao;
import com.service.TwoOldExceptionService;

public class CustmizedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age=0; boolean flag=true;
		while(flag) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("plz enter your age ");
		
		
		
		try {
		 age= Integer.parseInt(s.nextLine());
		 break;
		}catch(NumberFormatException nfe) {
			System.out.println("Please enter digit age its request");
			flag=true;
		}
		}
        if(age<30) {
        			TwoOldExceptionService service=new TwoOldExceptionService();
        				try {
        						service.getAge(age);
        				}catch(TooOldException t) {
			//t.printStackTrace();
        						System.out.println(" exception message delegated to main method  message is : " +t.msg);
        				}
        }
        
        else if (age>30) {
			
        			TooYoungExceptionDao dao=new TooYoungExceptionDao();
        				try {
        						boolean b	=dao.isChance(age);
        							System.out.println("you can marry  "+b);
        				}catch(TooYoungException e) {
        					System.out.println(e.getMessage());
        				}
        }else {
        	System.out.println(" yes 30 is the best age for marry ");
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
