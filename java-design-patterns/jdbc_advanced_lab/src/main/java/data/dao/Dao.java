package data.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Dao <T, Id extends UUID> {
    List<T> getAll();
    T create(T entity);
    Optional<T> getOne(Id id);
    T update(T entity);
    void delete(Id id);
}
