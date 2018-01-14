package vinay.leaveportal.dao;

import vinay.leaveportal.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee get(int EmployeeId);
    List<Employee> list();
    boolean add(Employee Employee);
    boolean update(Employee Employee);
    boolean delete(Employee Employee);

    // business methods
    List<Employee> listActiveEmployees();
    List<Employee> listActiveEmployeesByCategory(int categoryId);
    List<Employee> getLatestActiveEmployees(int count);



}
