package com.chakans.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import com.chakans.chakanmodule.multipledatasource.properties.DatabaseProperties;

public abstract class DatabaseConfig {

	public abstract DataSource dataSource();

	protected void configureDataSource(org.apache.tomcat.jdbc.pool.DataSource dataSource, DatabaseProperties databaseProperties) {
		dataSource.setDriverClassName(databaseProperties.getDriverClassName());
		dataSource.setUrl(databaseProperties.getUrl());
		dataSource.setUsername(databaseProperties.getUserName());
		dataSource.setPassword(databaseProperties.getPassword());
		dataSource.setMaxActive(databaseProperties.getMaxActive());
		dataSource.setMaxIdle(databaseProperties.getMaxIdle());
		dataSource.setMinIdle(databaseProperties.getMinIdle());
		dataSource.setMaxWait(databaseProperties.getMaxWait());
		dataSource.setValidationQuery(databaseProperties.getValidationQuery());
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);
	}
}