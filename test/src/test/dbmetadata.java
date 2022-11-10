package test;

import java.sql.*;
public class dbmetadata {
    
    public static void main(String[] args)throws Exception 
    {
    	/*
    	 * jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
    	 * 
    	 */
     
    	/*
    	 * <dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <version>8.2.1.jre11</version>
</dependency>
#Java Connect to Microsoft SQL Server
Step 2: JDBC
    	 */
    	
    	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
//    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Driver loaded...");
     
        //jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret
        Connection con=DriverManager.getConnection(
//        		"jdbc:sqlserver://localhost\\\\sqlexpress;user=sa;password=Root123$");
        	"jdbc:sqlserver://localhost/test",
        	"sa", "Root123$");
        
//        		"root","charan");
        System.out.println("Connected to the database");
     
     DatabaseMetaData rsmd=con.getMetaData();
    
     System.out.println("database name="+rsmd.getDatabaseProductName());
     System.out.println("database version="+rsmd.getDatabaseProductVersion());
     System.out.println("Driver version="+rsmd.getDriverVersion());
     System.out.println("Table name size="+rsmd.getMaxTableNameLength());
     System.out.println("max no. of columns="+rsmd.getMaxColumnsInTable());  
     con.close();
    }
     
}
