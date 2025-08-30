import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String url = "jdbc:mariadb://localhost:3306/bookstore";
    private static String username = "root";
    private static String password = "password";

    public Database() {}

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
