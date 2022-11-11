package statements.select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryAllRecordsDemo {

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
			
			String selectAllQuery = "select * from employee";
			
			ResultSet resultSet = statement.executeQuery(selectAllQuery);
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);				
				String name  = resultSet.getString(2);				
				String address = resultSet.getString(3);
			
				System.out.println(String.format(
					"Id is %d, name is %s, address is %s", 
					id, name, address));
			}
			
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
