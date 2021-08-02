package com.naresh.firstapp;

public class MessagePrinterTask  implements  Runnable{

	private String message;
	public  MessagePrinterTask(String message) {
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("printing message :"+message);
	}

}
