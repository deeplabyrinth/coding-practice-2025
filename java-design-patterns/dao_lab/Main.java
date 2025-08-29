import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

//		Employee employee = new Employee(1, 123456, "Sailor", "Seagull", 3);
//
//		System.out.println(employee);

        Connection c = Database.getConnection();

        if (c != null) {
            System.out.print("Database connection successful");
        }
	}
}
