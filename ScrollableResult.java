import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ScrollableResult{
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
        
            rs.afterLast();
            while (rs.previous()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String address = rs.getString("address");
            System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
            }
            //System.out.println("---------------------");
            //rs.absolute(5); // move cursor to 5th record
            //System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ",
            // Address: " + rs.getString(3));
            rs.close();
            stmt.close();
            conn.close();
            } catch (SQLException e) {
            e.printStackTrace();
                    }

                }
            }