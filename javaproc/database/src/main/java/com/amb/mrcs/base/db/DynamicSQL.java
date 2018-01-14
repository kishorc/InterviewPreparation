package com.kru.ck.base.db;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author smanchikalapudi
 * This example intended for constructing and executing an SQL statement for the given inputs.
 * Scenario: There is an employee search will happen based on given employee object. 
 * The properties of the employee may empty or null.
 * The search should happen based on the available inputs only.
 */
public class DynamicSQL {

	public static void main(String[] args) {
		DynamicSQL dynamicSQL = new DynamicSQL();
		dynamicSQL.construcAndExecuteSQL(args);
	}
	
	public void construcAndExecuteSQL(String[] args) {
		StringBuffer sql = new StringBuffer("select * from employee");

		List<Object> list = new ArrayList<Object>();
		setSql(list, sql, "first_name", args[0]);
		setSql(list, sql, "last_name", args[1]);
		setSql(list, sql, "salary", args[2]);
		setSql(list, sql, "empId", args[3]);
		
		// Executing sql query with JDBCTemplate in Spring.
		// jdbctemplate.query( sql, list.toArray(new Object[0]), RowMapper);
	}

	public void setSql(List<Object> list, StringBuffer sql, String column,
			String value) {
		if (value != null && !value.isEmpty()) {
			if (list.isEmpty()) {
				sql.append(" WHERE ").append(column).append("=? ");

			} else {
				sql.append(" AND ").append(column).append("=? ");
			}

			list.add(value);
		}
	}

}
