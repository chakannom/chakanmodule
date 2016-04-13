package com.chakannom.chakanmodule.multiplemybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multiplemybatis.annotation.DataSource0;

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE, annotationClass = DataSource0.class, sqlSessionFactoryRef = "dataSource0SqlSessionFactory")
public class DataSource0MyBatisConfig extends MyBatisConfig {

	@Bean
	public SqlSessionFactory dataSource0SqlSessionFactory(@Qualifier("dataSource0") DataSource dataSource0) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		configureSqlSessionFactory(sqlSessionFactoryBean, dataSource0);
		return sqlSessionFactoryBean.getObject();
	}
}
