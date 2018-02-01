package com.kru.ck.base.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public TestConnection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		contest1();

	}
	
	
	static void contest1()
	{
		String driver = "";
		String user = "";
		String password = "";
		String url = "";
		Connection con = createConnection(driver, user, password, url);
		System.out.println(con);
	}
	
	public static Connection createConnection(String driver, String user, String password, String url)
	{
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
