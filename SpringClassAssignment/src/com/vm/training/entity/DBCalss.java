package com.vm.training.entity;

public class DBCalss
{
	private Oracle oracle;
	private MySql mySql;
	public void setOracle(Oracle oracle) {
		this.oracle = oracle;
	}
	public void setMySql(MySql mySql) {
		this.mySql = mySql;
	}
	public void displayDetailsOfDataBase()
	{
		oracle.databaseName();
		mySql.databaseName();
	}
}
