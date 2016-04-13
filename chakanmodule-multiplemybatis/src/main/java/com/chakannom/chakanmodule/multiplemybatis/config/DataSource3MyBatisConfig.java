package com.chakannom.chakanmodule.multiplemybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakannom.chakanmodule.multiplemybatis.annotation.DataSource3;

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE, annotationClass = DataSource3.class, sqlSessionFactoryRef = "dataSource3SqlSessionFactory")
public class DataSource3MyBatisConfig extends MyBatisConfig {

	@Bean(name = "dataSource3SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource3") DataSource dataSource3) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		configureSqlSessionFactory(sqlSessionFactoryBean, dataSource3);
		return sqlSessionFactoryBean.getObject();
	}
}