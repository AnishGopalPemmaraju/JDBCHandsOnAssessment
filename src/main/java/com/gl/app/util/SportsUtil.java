package com.gl.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class SportsUtil {
	 private static final String URL = "";
	    private static final String USER = "	";
	    private static final String PASSWORD = "	";
	    static AtomicInteger counter = new AtomicInteger();

	    public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            throw new RuntimeException("Error connecting to the database", e);
	        }
	    }
	    public int generateUniqueId(String columnName, String tableName, int initialValue) {
	        Connection conn = getConnection();
	        int uniqueId = 0;
	        //Write the query to generate unique id
	        return uniqueId;
	    }
	    
	    
}
