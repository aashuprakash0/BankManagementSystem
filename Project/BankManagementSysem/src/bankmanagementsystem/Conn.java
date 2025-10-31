package bankmanagementsystem;
import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            System.out.println("Loading driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");

            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Ramu123!");
            s = c.createStatement();
            System.out.println("✅ Database connected successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found! " + e);
        } catch (SQLException e) {
            System.out.println("❌ SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("❌ Unknown Error: " + e);
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
