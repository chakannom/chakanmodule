package com.chakannom.chakanmodule.multipledatasource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DataSource3DatabaseProperties.PREFIX)
public class DataSource3DatabaseProperties implements DatabaseProperties {

	public static final String PREFIX = "chakan.module.datasource[3]"; 

	private String driverClassName;
	
	private String url;
	
	private String userName;
	
	private String password;
	
	private int initialSize;
	
	private int maxActive;
	
	private int maxIdle;
	
	private int minIdle;
	
	private int maxWait;
	
	private String validationQuery;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public int getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}
	
	public String getValidationQuery() {
		return validationQuery;
	}
	
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	
	@Override
	public String toString() {
		return "DataSource3DatabaseProperties[" + this.driverClassName + "]";
	}
}
