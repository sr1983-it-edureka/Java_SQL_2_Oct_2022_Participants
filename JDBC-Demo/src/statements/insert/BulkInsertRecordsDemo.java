package statements.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class BulkInsertRecordsDemo {

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
			
			ArrayList<Employee> employees = createEmployees();
			
			Iterator<Employee> iterator = employees.iterator();
			while (iterator.hasNext()) {
				
				Employee employee = iterator.next();

				String insertQuery = 
						String.format("insert into employee (name, address, id) "
						+ "values "
						+ "('%s', '%s', %d)", 
							employee.name, employee.address, employee.id);
				
				int noOfRowsAffected = statement.executeUpdate(insertQuery);
				
				// INSERT -> 100 [s
				// COMMIT -> 100 [
			
				System.out.println("No of Rows affected " + noOfRowsAffected);					
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
	
	
	static ArrayList<Employee>	createEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		for (int index = 1; index <=10; index ++) {
			
			Employee employee = new Employee();
			employee.id = 200 + index;
			employee.name = "EName - " + employee.id;
			employee.address = "EAddress - " + employee.id;
					
			employees.add(employee);
		}
		
		return employees;
	}
}
