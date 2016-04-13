package com.chakannom.chakanmodule.multiplemybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multiplemybatis.annotation.DataSource2;

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE, annotationClass = DataSource2.class, sqlSessionFactoryRef = "dataSource2SqlSessionFactory")
public class DataSource2MyBatisConfig extends MyBatisConfig {

	@Bean
	public SqlSessionFactory dataSource2SqlSessionFactory(@Qualifier("dataSource2") DataSource dataSource2) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		configureSqlSessionFactory(sessionFactoryBean, dataSource2);
		return sessionFactoryBean.getObject();
	}
}