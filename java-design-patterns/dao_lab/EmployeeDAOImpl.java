import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Employee employee) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Employee employee) throws SQLException {
        return 0;
    }

    @Override
    public int update(Employee employee) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Employee employee) throws SQLException {
        return 0;
    }
}
