package in.techdenovo.japps.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtility {

    private String  url="jdbc:mysql://localhost:3306/mydatabase";
    private String username="root";
    private String password="";


    public Connection getConnection(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
