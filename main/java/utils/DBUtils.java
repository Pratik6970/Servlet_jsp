package utils;
import java.sql.Connection;
import static utils.DBUtils.fetchDBConnection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	
		private static Connection connection;// null
		// add a static method to return SINGLETON (=single instance in the entire Java
		// App) to the caller

		public static Connection fetchDBConnection() throws ClassNotFoundException, SQLException{
			if (connection == null) {
				String url = "jdbc:mysql://localhost:3306/dac22?useSSL=false&allowPublicKeyRetrieval=true";
				connection = DriverManager.getConnection(url, "root","Pratik@123");
			}
			return connection;
		}
		//add a static method to close connection.
		public static void closeConnection() throws SQLException
		{
			if(connection != null)
				connection.close();
		}


}


