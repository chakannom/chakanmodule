package com.chakannom.chakanmodule.multiplemybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multiplemybatis.annotation.DataSource1;

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE, annotationClass = DataSource1.class, sqlSessionFactoryRef = "dataSource1SqlSessionFactory")
public class DataSource1MyBatisConfig extends MyBatisConfig {

	@Bean
	public SqlSessionFactory dataSource1SqlSessionFactory(@Qualifier("dataSource1") DataSource dataSource1) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		configureSqlSessionFactory(sessionFactoryBean, dataSource1);
		return sessionFactoryBean.getObject();
	}
}