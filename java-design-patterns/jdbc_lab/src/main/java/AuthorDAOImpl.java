import java.sql.SQLException;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
    @Override
    public Author get(int id) throws SQLException {
        return null;
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
