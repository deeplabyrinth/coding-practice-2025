import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws SQLException {

//        System.out.println("Hello, world");
//        Author author = new Author(1, "Franz", "Kafka", "Czech Republic");

//        System.out.println(author);

//        Connection connection = Database.getConnection();
//
//        if (connection != null) {
//            System.out.println("Database connection established");
//        }

        AuthorDAO authorDAO = new AuthorDAOImpl();

        Author author = authorDAO.get(2);

        System.out.println(author);
    }

}
