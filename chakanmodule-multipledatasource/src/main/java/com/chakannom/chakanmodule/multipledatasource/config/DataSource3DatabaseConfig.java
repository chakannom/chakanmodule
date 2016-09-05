package com.chakannom.chakanmodule.multipledatasource.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multipledatasource.properties.DataSource3DatabaseProperties;

@Configuration
@EnableConfigurationProperties(DataSource3DatabaseProperties.class)
class DataSource3DatabaseConfig extends DatabaseConfig {

	@Autowired
	private DataSource3DatabaseProperties dataSource3DatabaseProperties;

	@Override
	@Bean(name="dataSource3", destroyMethod="close")
	public DataSource dataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource3 = new org.apache.tomcat.jdbc.pool.DataSource();
		configureDataSource(dataSource3, dataSource3DatabaseProperties);
		return dataSource3;
	}
}