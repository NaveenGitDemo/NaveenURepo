package com.naresh.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class firstBootApp {
	/*
	 * @Autowired DataSourceUtil dataSourceUtil;
	 */
	/*
	 * void getUrl() { DataSourceUtil data=new DataSourceUtil();
	 * System.out.println(data.getUrl()); data.sayhello(); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context=	SpringApplication.run(firstBootApp.class, args);
		
	DataSourceUtil ds=context.getBean(DataSourceUtil.class);
	
	System.out.println(ds.getUrl() + "   " +ds.getUsername());
	System.out.println(" First Demo ");
	
		
	}

}
