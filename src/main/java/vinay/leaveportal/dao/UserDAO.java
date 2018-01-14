package vinay.leaveportal.dao;

import java.util.List;

import vinay.leaveportal.entity.Users;

public interface UserDAO {
    Users get(int loginId);
    List<Users> list();
    boolean add(Users user);
    boolean update(Users user);
    boolean delete(Users user);

    // business methods
    List<Users> listUsersByAccessType();
    List<Users> listUsers();
    //List<Users> getLatestActiveEmployees(int count);
}
