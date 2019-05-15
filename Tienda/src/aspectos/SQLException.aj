package aspectos;


	public aspect SQLException {

		pointcut handleSQLException(): 
			handler(java.sql.SQLException);

		before() : handleSQLException()  {
			System.out.println("Error tipo SQLException");
		}

	}


