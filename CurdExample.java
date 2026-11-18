import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CurdExample {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/test";
    private static final String user = "root";
    private static final String password = "";

    // INSERT USER
    public static void insertUser(String name, String address) {

        String sql = "INSERT INTO users(name, address) VALUES(?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, address);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("User inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE USER
    public static void updateUser(int id, String newName, String newAddress) {

        String sql = "UPDATE users SET name = ?, address = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newName);
            pstmt.setString(2, newAddress);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("User " + id + " updated successfully!");
            } else {
                System.out.println("User " + id + " not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // INSERT 10 USERS
        insertUser("User1", "Kathmandu");
        insertUser("User2", "Lalitpur");
        insertUser("User3", "Bhaktapur");
        insertUser("User4", "Pokhara");
        insertUser("User5", "Chitwan");
        insertUser("User6", "Butwal");
        insertUser("User7", "Dharan");
        insertUser("User8", "Biratnagar");
        insertUser("User9", "Banepa");
        insertUser("User10", "Hetauda");

        // UPDATE 10 USERS
        updateUser(1, "Lisa", "Patan");
        updateUser(2, "Jennie", "Kathmandu");
        updateUser(3, "Rose", "Lalitpur");
        updateUser(4, "Jisoo", "Bhaktapur");
        updateUser(5, "Sana", "Pokhara");
        updateUser(6, "Mina", "Chitwan");
        updateUser(7, "Nayeon", "Butwal");
        updateUser(8, "Momo", "Dharan");
        updateUser(9, "Tzuyu", "Biratnagar");
        updateUser(10, "Dahyun", "Banepa");
    }
}