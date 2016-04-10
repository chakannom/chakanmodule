package com.chakannom.chakanmodule.multipledatasource.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DataSource2DatabaseProperties.PREFIX)
public class DataSource2DatabaseProperties implements DatabaseProperties {

	public static final String PREFIX = "chakan.module.datasource[2]"; 

	@Value("${chakan.module.datasource[2].driver-class-name:com.mysql.jdbc.Driver}")
	private String driverClassName;

	@Value("${chakan.module.datasource[2].url:jdbc:mysql://localhost:3306/dbname2}")
	private String url;

	@Value("${chakan.module.datasource[2].user-name:username}")
	private String userName;

	@Value("${chakan.module.datasource[2].password:password}")
	private String password;

	@Value("${chakan.module.datasource[2].initial-size:3}")
	private int initialSize;

	@Value("${chakan.module.datasource[2].max-active:3}")
	private int maxActive;

	@Value("${chakan.module.datasource[2].min-idle:2}")
	private int maxIdle;

	@Value("${chakan.module.datasource[2].max-idle:3}")
	private int minIdle;

	@Value("${chakan.module.datasource[2].max-wait:3000}")
	private int maxWait;

	@Value("${chakan.module.datasource[2].validation-query:SELECT 1}")
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
		return "DataSource2DatabaseProperties[" + this.driverClassName + "]";
	}
}