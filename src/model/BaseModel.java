package model;

import controller.DbConnection;

public abstract class BaseModel {
	
	
	DbConnection connection;
	
	public BaseModel() {
		connection = new DbConnection();
	}
	
	
	public DbConnection getConnection() {
		return connection;
	}

}
