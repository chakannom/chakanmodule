package com.chakans.chakanmodule.multipledatasource.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DataSource1DatabaseProperties.PREFIX)
public class DataSource1DatabaseProperties implements DatabaseProperties {

	public static final String PREFIX = "chakan.module.datasource[1]"; 

	@Value("${chakan.module.datasource[1].driver-class-name:com.mysql.jdbc.Driver}")
	private String driverClassName;

	@Value("${chakan.module.datasource[1].url:jdbc:mysql://localhost:3306/dbname1}")
	private String url;

	@Value("${chakan.module.datasource[1].user-name:username}")
	private String userName;

	@Value("${chakan.module.datasource[1].password:password}")
	private String password;

	@Value("${chakan.module.datasource[1].initial-size:3}")
	private int initialSize;

	@Value("${chakan.module.datasource[1].max-active:3}")
	private int maxActive;

	@Value("${chakan.module.datasource[1].min-idle:2}")
	private int maxIdle;

	@Value("${chakan.module.datasource[1].max-idle:3}")
	private int minIdle;

	@Value("${chakan.module.datasource[1].max-wait:3000}")
	private int maxWait;

	@Value("${chakan.module.datasource[1].validation-query:SELECT 1}")
	private String validationQuery;

	@Value("${chakan.module.datasource[1].validation-interval:34000}")
	private int validationInterval;

	@Override
	public String getDriverClassName() {
		return driverClassName;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public int getInitialSize() {
		return initialSize;
	}

	@Override
	public int getMaxActive() {
		return maxActive;
	}

	@Override
	public int getMaxIdle() {
		return maxIdle;
	}

	@Override
	public int getMinIdle() {
		return minIdle;
	}

	@Override
	public int getMaxWait() {
		return maxWait;
	}

	@Override
	public String getValidationQuery() {
		return validationQuery;
	}

	@Override
	public int getValidationInterval() {
		return validationInterval;
	}

	@Override
	public String toString() {
		return "DataSource1DatabaseProperties[" + this.driverClassName + "]";
	}
}