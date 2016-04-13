package com.chakannom.chakanmodule.multiplemybatis.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

public abstract class MyBatisConfig {

	public static final String BASE_PACKAGE = "**.mapper";
	public static final String TYPE_ALIASES_PACKAGE = "**.domain";

	protected void configureSqlSessionFactory(SqlSessionFactoryBean sqlSessionFactoryBean, DataSource dataSource) throws IOException {
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
		sqlSessionFactoryBean.setTransactionFactory(new ManagedTransactionFactory());
	}
}