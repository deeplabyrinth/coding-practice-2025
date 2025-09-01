package data.dao;

import data.entity.Author;
import data.util.DatabaseUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

public class AuthorDao implements Dao<Author, UUID> {
    private static final Logger LOGGER = Logger.getLogger(AuthorDao.class.getName());
    private static final String GET_ALL = "select author_id, name_last, name_first, country from authors";

    @Override
    public List<Author> getAll() {
        List<Author> authors = new ArrayList<>();

        Connection connection = DatabaseUtils.getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(GET_ALL);
            authors = processResultSet(rs);
        } catch (SQLException e) {
            DatabaseUtils.handleSQLException("AuthorDao.getAll", e, LOGGER);
        }

        return authors;
    }

    @Override
    public Author create(Author entity) {
        return null;
    }

    @Override
    public Optional<Author> getOne(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public Author update(Author entity) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    private List<Author> processResultSet(ResultSet rs) throws SQLException {
        List<Author> authors = new ArrayList<>();

        while (rs.next()) {
            Author author = new Author();
            author.setAuthorId((UUID)rs.getObject("author_id"));
            author.setLastName(rs.getString("name_last"));
            author.setFirstName(rs.getString("name_first"));
            author.setCountry(rs.getString("country"));

            authors.add(author);
        }

        return authors;
    }
}
