package data.dao;

import data.entity.Author;
import data.util.DatabaseUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

public class AuthorDao implements Dao<Author, UUID> {
    private static final Logger LOGGER = Logger.getLogger(AuthorDao.class.getName());
    private static final String GET_ALL = "select author_id, last_name, first_name, country from authors";
    private static final String CREATE = "insert into authors (author_id, last_name, first_name, country) values (?,?,?,?)";
    private static final String GET_ONE = "select author_id, last_name, first_name, country from authors where author_id = ?";

    @Override
    public List<Author> getAll() {
        List<Author> authors = new ArrayList<>();

        Connection connection = DatabaseUtils.getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(GET_ALL);
            authors = this.processResultSet(rs);
        } catch (SQLException e) {
            DatabaseUtils.handleSQLException("AuthorDao.getAll", e, LOGGER);
        }

        return authors;
    }

    @Override
    public Author create(Author entity) {
        UUID authorId = UUID.randomUUID();
        Connection connection = DatabaseUtils.getConnection();

        try {
            connection.setAutoCommit(false);

            PreparedStatement statement = connection.prepareStatement(CREATE);
            statement.setObject(1, authorId);
            statement.setString(2, entity.getLastName());
            statement.setString(3, entity.getFirstName());
            statement.setString(4, entity.getCountry());

            statement.execute();
            connection.commit();
            statement.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException sqle) {
                DatabaseUtils.handleSQLException("AuthorDao.create.rollback", sqle, LOGGER);
            }

            DatabaseUtils.handleSQLException("AuthorDao.create", e, LOGGER);
        }

        Optional<Author> author = this.getOne(authorId);
        if (!author.isPresent()) {
            return null;
        }
        return author.get();
    }

    @Override
    public Optional<Author> getOne(UUID uuid) {
        try (
                Connection connection = DatabaseUtils.getConnection();
                PreparedStatement statement = connection.prepareStatement(GET_ONE);
        ) {
            statement.setObject(1, uuid);
            ResultSet rs = statement.executeQuery();
            List<Author> authors = this.processResultSet(rs);
            if (authors.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(authors.get(0));
        } catch (SQLException e) {
            DatabaseUtils.handleSQLException("AuthorDao.getOne", e, LOGGER);
        }
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
            author.setLastName(rs.getString("last_name"));
            author.setFirstName(rs.getString("first_name"));
            author.setCountry(rs.getString("country"));

            authors.add(author);
        }

        return authors;
    }
}
