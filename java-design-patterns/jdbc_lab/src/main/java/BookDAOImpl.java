import java.sql.SQLException;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public Book get(int id) throws SQLException {

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
