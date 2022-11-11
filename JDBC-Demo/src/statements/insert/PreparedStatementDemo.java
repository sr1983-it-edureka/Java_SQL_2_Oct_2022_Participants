package statements.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		
		// Load the driver
		String msSqlServerClassname 
			= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		try {
			Class.forName(msSqlServerClassname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Class Loaded...");
	
		// 
		String connectionUrl 
		= 	"jdbc:sqlserver://localhost:1433;"
	        + "databaseName=javasql_training_2;user=sa;password=Root123$"
	        + ";encrypt=true;trustServerCertificate=true;";


		Connection connection = null;
		try {
			 
			connection = DriverManager.getConnection(connectionUrl);
			
			System.out.println("Connection established ....");
			
			String insertQuery = "insert into employee (id, name, address) "
					+ "values (?, ?, ?)";			
			
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			for (int index = 1; index < 10; index ++) {

				int id = 400 + index;
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, "E Name - " + id);
				preparedStatement.setString(3, "E Address - " + id);
				
				int noOfRowsAffected = preparedStatement.executeUpdate();
			
				System.out.println("No of Rows affected " + noOfRowsAffected);	
			}
			
			// 3 + 1 * 10 = 13 seconds
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	}	
	
}
