package com.naresh.firstapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "db")
public class DataSourceUtil {
	

	//@Value("${db.url}")
	private String url;
	private String username;

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
		return "DataSourceUtil [url=" + url + ", username=" + username + "]";
	}

	public DataSourceUtil(String url, String username) {
		super();
		this.url = url;
		this.username = username;
	}
	

	
	

}
