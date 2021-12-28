package dao;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(com.codegym.model.User user) throws SQLException;

    public com.codegym.model.User selectUser(int id);

    public List<com.codegym.model.User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(com.codegym.model.User user) throws SQLException;
    void addUserTransaction(com.codegym.model.User user, int[] permision);
    public void insertUpdateWithoutTransaction();
}
