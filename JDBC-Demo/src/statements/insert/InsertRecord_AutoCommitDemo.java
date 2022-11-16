package statements.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord_AutoCommitDemo {

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
			
			Statement statement = connection.createStatement();
			
			String insertQuery = "insert into employee (name, address, id) "
					+ "values "
					+ "('E-100', 'Address - 100', 450)";
			
			int noOfRowsAffected = statement.executeUpdate(insertQuery);
		
			System.out.println("No of Rows affected " + noOfRowsAffected);	
			
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
