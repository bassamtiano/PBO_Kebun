package pbo_kebun.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    public Connection create_connection(){
        String url = "jdbc:mysql://localhost:3306/kebun";
        String username = "root";
        String password = "";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            
            return conn;
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
