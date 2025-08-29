import java.sql.SQLException;
import java.util.List;

public interface DAO<T> { //turn into a generic interface

	//The following methods provide content for any object that
	//requires persistence or saving of data to a relational db

	T get(int id) throws SQLException;

	List<T> getAll() throws SQLException;

	int save(T t) throws SQLException;

	int insert(T t) throws SQLException;

	int update(T t) throws SQLException;

	int delete(T t) throws SQLException;
}
