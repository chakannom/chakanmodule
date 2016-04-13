package com.chakannom.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multipledatasource.properties.DataSource1DatabaseProperties;

@Configuration
@EnableConfigurationProperties(DataSource1DatabaseProperties.class)
class DataSource1DatabaseConfig extends DatabaseConfig {

	@Autowired
	private DataSource1DatabaseProperties dataSource1DatabaseProperties;

	@Override
	@Bean(name = "dataSource1", destroyMethod = "close")
	public DataSource dataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource1 = new org.apache.tomcat.jdbc.pool.DataSource();
		configureDataSource(dataSource1, dataSource1DatabaseProperties);
		return dataSource1;
	}
}
