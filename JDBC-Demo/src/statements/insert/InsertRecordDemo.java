package statements.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordDemo {

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
			
			// Step1 -> INSERT/UPDATE/DELETE
			// Step2 -> Decision [Commit / Rollback]
			//		  -> Default / Commit
			
			connection = DriverManager.getConnection(connectionUrl);
			connection.setAutoCommit(false);
			
			System.out.println("Connection established ....");
			
			Statement statement = connection.createStatement();
			
			String insertQuery = "insert into employee (name, address, id) "
					+ "values "
					+ "('E-450', 'Address - 450', 451)";
			
			// Step 1
			int noOfRowsAffected = statement.executeUpdate(insertQuery);
			
			
			// Step 2
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Do you want to commit (Y / N)?");
			
			if (scanner.hasNextLine()) {
				
				String userResponse = scanner.nextLine();
				
				if (userResponse.equals("Y")) {
					connection.commit();
				}else {
					connection.rollback();
				}
			}
		
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
