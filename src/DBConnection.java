import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;
	     {
	        
	        try {
	            
	            Class.forName("com.mysql.jdbc.Driver");

			conn=DriverManager.getConnection(url, user,passwd);
	        } catch (ClassNotFoundException | SQLException e) {
	            throw new RuntimeException("not connected " ,e);
	        }
	    
		}

	    
	    public static Connection getConn() {
			return conn;
		}


		
	
}
