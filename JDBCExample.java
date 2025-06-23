import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCExample {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Successfully connected to the database!");

                // Create a statement
                Statement stmt = conn.createStatement();

                // Create table if not exists
                String createTable = "CREATE TABLE IF NOT EXISTS students " +
                                   "(id INT PRIMARY KEY AUTO_INCREMENT, " +
                                   " name VARCHAR(50), " +
                                   " age INT)";
                stmt.executeUpdate(createTable);

                // Insert sample data
                stmt.executeUpdate("INSERT INTO students (name, age) VALUES ('John Doe', 20)");
                stmt.executeUpdate("INSERT INTO students (name, age) VALUES ('Jane Smith', 22)");

                // Execute a query
                System.out.println("\nRetrieving student records...");
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");

                // Process the result set
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }

                // Clean up
                rs.close();
                stmt.close();
                conn.close();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
} 