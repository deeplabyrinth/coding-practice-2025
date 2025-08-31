import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookDAOImpl implements BookDAO {

    @Override
    public Book get(int authorId) throws SQLException {
        Connection connection = Database.getConnection();
        String sql = "SELECT * FROM books WHERE author_id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, authorId);
        ResultSet rs = ps.executeQuery();

        Book book = null;
        if (rs.next()) {
            String isbn = rs.getString("isbn");
            String title = rs.getString("title");
            String yearPublished = rs.getString("year_pub");

            book = new Book(isbn, title, authorId, yearPublished);
        }

        return book;
    }

    @Override
    public List<Book> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Book book) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Book book) throws SQLException {
        return 0;
    }

    @Override
    public int update(Book book) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Book book) throws SQLException {
        return 0;
    }
}
