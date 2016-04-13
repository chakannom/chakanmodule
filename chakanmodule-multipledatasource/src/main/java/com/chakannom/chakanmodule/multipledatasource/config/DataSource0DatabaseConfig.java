package com.chakannom.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.chakannom.chakanmodule.multipledatasource.properties.DataSource0DatabaseProperties;

@Configuration
@EnableConfigurationProperties(DataSource0DatabaseProperties.class)
class DataSource0DatabaseConfig extends DatabaseConfig {

	@Autowired
	private DataSource0DatabaseProperties dataSource0DatabaseProperties;

	@Primary
	@Override
	@Bean(name = "dataSource0", destroyMethod = "close")
	public DataSource dataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource0 = new org.apache.tomcat.jdbc.pool.DataSource();
		configureDataSource(dataSource0, dataSource0DatabaseProperties);
		return dataSource0;
	}
}