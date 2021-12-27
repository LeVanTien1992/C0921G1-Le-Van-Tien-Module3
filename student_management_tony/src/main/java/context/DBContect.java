package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContect {
    public Connection DBConnect(){
        final String url = "jdbc:mysql://localhost:3306/student_management";
        final String user = "root";
        final String pass = "levantien341992";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }
}
