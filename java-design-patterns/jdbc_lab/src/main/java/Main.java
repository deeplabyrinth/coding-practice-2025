import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

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

//        AuthorDAO authorDAO = new AuthorDAOImpl();
//
//        Author author = authorDAO.get(3);
//
//        System.out.println(author);
//
//        author = new Author(0, "George", "Orwell", "India");
//        int result = authorDAO.insert(author);
//
//        System.out.println(result);

//        AuthorDAO authorDAO = new AuthorDAOImpl();
//        Author author = authorDAO.get(3);
//
//        System.out.println(author);
//
//        int result = authorDAO.delete(author);
//        System.out.println(result);


//        AuthorDAO authorDAO = new AuthorDAOImpl();
//
//        List<Author> authors = authorDAO.getAll();
//
//        authors.forEach(System.out::println);

        BookDAO bookDAO = new BookDAOImpl();
        Book book = bookDAO.get(2);

        System.out.println(book);


    }

}
