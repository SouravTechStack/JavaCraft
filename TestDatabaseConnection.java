package CarRental.example.CarRental;



    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class TestDatabaseConnection {
        public static void main(String[] args) {
            String jdbcUrl = "jdbc:postgresql://localhost:5432/carrental";
            String username = "postgres";
            String password = "root";

            try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
                System.out.println("Connection successful!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


