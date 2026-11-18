import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableResultSet {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM books";

            try (PreparedStatement stmt = conn.prepareStatement(
                    sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    int stock = rs.getInt("quantity") + 50;

                    rs.updateInt("quantity", stock);

                    rs.updateRow();
                }

                System.out.println("Quantity updated successfully!");

            } catch (SQLException e) {

                System.out.println(
                    "Error with the ResultSet or PreparedStatement: "
                    + e.getMessage()
                );
            }

            conn.close();

        } catch (SQLException e) {

            System.out.println("Connection error: " + e.getMessage());
        }
    }
}