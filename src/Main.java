import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //create url
        String url = "JDBC:mysql://127.0.0.1:3306/employee_database";


        try {
            //get connection
            Connection conn = DriverManager.getConnection(url,"root","Root");

            //create statement
            Statement statement = conn.createStatement();

            //execute update
            int affectedRows = statement.executeUpdate("DELETE FROM employees" +
                    " WHERE id = 700");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}