package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionn {
    public static Connection CreateConnection(){
        Connection conn = null;
        String url="jdbc:mysql://localhost:3306/qlch";
        String Username = "root";
        String Password = "Hangham1999";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn= DriverManager.getConnection(url, Username, Password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;

    }
}
