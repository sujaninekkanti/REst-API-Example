package com.restsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {  
	public static Connection getConnection( ) throws ClassNotFoundException, SQLException{   
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.print("in connection calss....");
        con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
        System.out.println("Connected.......");
        return con;
	}     
	public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
