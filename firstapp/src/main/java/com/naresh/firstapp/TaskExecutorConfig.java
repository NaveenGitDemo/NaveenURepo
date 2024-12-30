package com.naresh.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class TaskExecutorConfig {
   
	
	
	public  ThreadPoolTaskExecutor executor;
	@Bean
	public  TaskExecutor getTaskExecutorPool() {
		executor=new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(15);
		executor.setQueueCapacity(25);
		
		return executor;
	}
	
	public ThreadPoolTaskScheduler scheduler;
	
	@Bean
	@Primary
	public TaskScheduler getTaskSchedulerPool() {
		scheduler=new ThreadPoolTaskScheduler();
		scheduler.setPoolSize(10);
		
		return scheduler;
	}
	
	
}
