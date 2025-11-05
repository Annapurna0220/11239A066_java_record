import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args) {
       String url = "jdbc:mysql://127.0.0.1:3306/college?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
String user = "root";
String password = ""; // empty if you log in to XAMPP without a password


        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Display results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
