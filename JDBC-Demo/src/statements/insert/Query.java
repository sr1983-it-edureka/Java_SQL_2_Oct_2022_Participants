package statements.insert;

public class Query {

	// INSERT INTO EMPLOYEE (F1, F2, F3) VALUES (V1, V2, V3)
	// Stages
		// Stage 1
			// Syntax Validation [3 seconds]
		// Stage N
			// Query Executed [1 second] 
	// Statement - JDBC
		// INSERT - 4 seconds
		// 100 INSERT - 4 * 100 = 400 seconds
	
	
	// PreparedStatement
		// INSERT INTO EMPLOYEE (F1, F2, F3) VALUES (?, ?, ?)
	// Syntax Validation - 3 seconds
	
	// Run 1 - 1 second
	// Run 2 - 1 second
	// Run 10 - 1 second
	
}
