import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Database {

    private static String url = "jdbc:mysql://localhost:3306/"; // this is made-up
    private static String user = "root";
    private static String password = "password";

    private Database() {

    }

    public static Connection getConnection() throws SQLException {

        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }
}
