package com.naresh.firstapp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "db")
@EnableConfigurationProperties
@Component
public class DataSourceUtil {
	

	//@Value("${db.url}")
	private String url;
	//@Value("${username}")
	private String username;
	@Value("${pwd}")
	private String pwd;

	
	public String getPwd() {
		//System.out.println("======pwd "+pwd);
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//@Bean
	public DataSourceUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

	public void sayhello() {
		System.out.println("hh");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "DataSourceUtil [url=" + url + ", username=" + username + ", pwd=" + pwd + "]";
	}

	
	/*public DataSourceUtil(String url, String username) {
		super();
		this.url = url;
		this.username = username;
	}*/
	
    
	public DataSourceUtil(String url, String username, String pwd) {
		super();
		this.url = url;
		this.username = username;
		this.pwd = pwd;
	} 
	
	@PostConstruct
	public  String getValues() {
		//System.out.println("pwd   ====="+getPwd());
		return getPwd();
	}
	
	
	
 
	

}
