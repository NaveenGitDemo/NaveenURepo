package com.naresh.firstapp;

import javax.annotation.PostConstruct;
import javax.jws.soap.InitParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class firstBootApp {
	
	  
	@Value("${krishn}")
	public String name;
	
	@Autowired
	public DataSourceUtil util;
	
	public  String getUrl() { 
	
		//DataSourceUtil util=new DataSourceUtil();
	 //System.out.println( " pwd from util "+util.getValues() );
	 System.out.println("name :"+name);
	 System.out.println("util" +util);
	  // return util.getValues();
	 return null;
	 }
	 
	
	
    @Autowired
	public  TaskExecutor taskExecutor;
	  @Autowired
	   public      TaskScheduler taskScheduler;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	DataSourceUtil util=new DataSourceUtil();
		//DataSourceUtil util1 =util.getdataSourceBean();
	ApplicationContext context=	SpringApplication.run(firstBootApp.class, args);
	
	  new firstBootApp().getUrl();  
	DataSourceUtil ds=context.getBean(DataSourceUtil.class);
	// String pwd=DataSourceUtil.getValues();
	// System.out.println("pwd "+pwd);
	//System.out.println(ds.getUrl() + "   " +ds.getUsername());
	System.out.println(" First Demo pwd is : "+ds.getPwd());
	//System.out.println(" First Demo pwd is : "+util1.getPwd());
	
	
		    
	}


	
    @PostConstruct
    @Scheduled(fixedDelay = 5000)
	public  void printMessage() {
		// TODO Auto-generated method stub
    	for(int i=0 ; i<25 ;i++) {
    		
    		taskExecutor.execute(new MessagePrinterTask("Message"+i));
    		//taskScheduler.scheduleAtFixedRate(new MessagePrinterTask("Message"+i),5000);
    	}
	}

}
