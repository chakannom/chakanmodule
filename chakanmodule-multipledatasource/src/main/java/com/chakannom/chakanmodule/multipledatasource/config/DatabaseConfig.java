package com.chakannom.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import com.chakannom.chakanmodule.multipledatasource.properties.DatabaseProperties;

public abstract class DatabaseConfig {

	@Bean
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