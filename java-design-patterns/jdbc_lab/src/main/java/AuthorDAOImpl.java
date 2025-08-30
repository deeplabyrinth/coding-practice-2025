import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
    @Override
    public Author get(int id) throws SQLException {
        Connection connection = Database.getConnection();
        Author author = null;

        String sql = "SELECT author_id, name_last, name_first, country FROM authors WHERE author_id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int authorId = rs.getInt("author_id");
            String lastName = rs.getString("name_last");
            String firstName = rs.getString("name_first");
            String country = rs.getString("country");

            author = new Author(authorId, lastName, firstName, country);
        }

        return author;
    }

    @Override
    public List<Author> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Author author) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Author author) throws SQLException {
        return 0;
    }

    @Override
    public int update(Author author) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }
}
