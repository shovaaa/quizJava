package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    public static Connection getDbConnect() {
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "");
                System.out.println("Quiz database connection successful");
            } catch (Exception e) {
                e.printStackTrace();
            } //catch (SQLException e){
            //e.printStackTrace();
            // }
            return con;
    }
}

