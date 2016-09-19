package com.chakans.chakanmodule.multipledatasource.properties;

public interface DatabaseProperties {

	public String getDriverClassName();
	
	public void setDriverClassName(String driverClassName);

	public String getUrl();
	
	public void setUrl(String url);

	public String getUserName();
	
	public void setUserName(String userName);

	public String getPassword();
	
	public void setPassword(String password);

	public int getInitialSize();
	
	public void setInitialSize(int initialSize);

	public int getMaxActive();
	
	public void setMaxActive(int maxActive);

	public int getMaxIdle();
	
	public void setMaxIdle(int maxIdle);

	public int getMinIdle();
	
	public void setMinIdle(int minIdle);

	public int getMaxWait();
	
	public void setMaxWait(int maxWait);

	public String getValidationQuery();
	
	public void setValidationQuery(String validationQuery);
}