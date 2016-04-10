package com.chakannom.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multipledatasource.properties.DataSource2DatabaseProperties;

@Configuration
@EnableConfigurationProperties(DataSource2DatabaseProperties.class)
class DataSource2DatabaseConfig extends DatabaseConfig {

	@Autowired
	private DataSource2DatabaseProperties dataSource2DatabaseProperties;

	@Bean(name = "dataSource2", destroyMethod = "close")
	public DataSource dataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource2 = new org.apache.tomcat.jdbc.pool.DataSource();
		configureDataSource(dataSource2, dataSource2DatabaseProperties);
		return dataSource2;
	}
}