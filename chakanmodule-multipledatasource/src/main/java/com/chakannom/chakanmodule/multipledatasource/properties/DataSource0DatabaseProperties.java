package com.chakannom.chakanmodule.multipledatasource.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DataSource0DatabaseProperties.PREFIX)
public class DataSource0DatabaseProperties implements DatabaseProperties {

	public static final String PREFIX = "chakan.module.datasource[0]"; 

	@Value("${chakan.module.datasource[0].driver-class-name:com.mysql.jdbc.Driver}")
	private String driverClassName;

	@Value("${chakan.module.datasource[0].url:jdbc:mysql://localhost:3306/dbname0}")
	private String url;

	@Value("${chakan.module.datasource[0].user-name:username}")
	private String userName;

	@Value("${chakan.module.datasource[0].password:password}")
	private String password;

	@Value("${chakan.module.datasource[0].initial-size:3}")
	private int initialSize;

	@Value("${chakan.module.datasource[0].max-active:3}")
	private int maxActive;

	@Value("${chakan.module.datasource[0].min-idle:2}")
	private int maxIdle;

	@Value("${chakan.module.datasource[0].max-idle:3}")
	private int minIdle;

	@Value("${chakan.module.datasource[0].max-wait:3000}")
	private int maxWait; 

	@Value("${chakan.module.datasource[0].validation-query:SELECT 1}")
	private String validationQuery;

	@Override
	public String getDriverClassName() {
		return driverClassName;
	}

	@Override
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int getInitialSize() {
		return initialSize;
	}

	@Override
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	@Override
	public int getMaxActive() {
		return maxActive;
	}

	@Override
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	@Override
	public int getMaxIdle() {
		return maxIdle;
	}

	@Override
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	@Override
	public int getMinIdle() {
		return minIdle;
	}

	@Override
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	@Override
	public int getMaxWait() {
		return maxWait;
	}

	@Override
	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}

	@Override
	public String getValidationQuery() {
		return validationQuery;
	}

	@Override
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	@Override
	public String toString() {
		return "DataSource0DatabaseProperties[" + this.driverClassName + "]";
	}
}