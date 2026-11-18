
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        String sql = "CREATE TABLE users (" +
                     "id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                     "name VARCHAR(30), " +
                     "address VARCHAR(50)" +
                     ")";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()
        ) {

            stmt.executeUpdate(sql);
            System.out.println("Table 'users' created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
