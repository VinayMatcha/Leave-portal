package vinay.leaveportal.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vinay.leaveportal.dao.EmployeeDAO;
import vinay.leaveportal.entity.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;


    private static List<Employee> employees = new ArrayList<>();


    @Override
    public Employee get(int EmployeeId) {

        try{
            return sessionFactory.getCurrentSession().get(Employee.class, Integer.valueOf(EmployeeId));
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Employee> list() {
        return sessionFactory.getCurrentSession().createQuery("From Employee",Employee.class).getResultList();
    }

    @Override
    public boolean add(Employee employee) {
        try{
            sessionFactory.getCurrentSession().persist(employee);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Employee employee) {
        try{
            sessionFactory.getCurrentSession().update(employee);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Employee employee) {
        try{
            employee.setStatus("false");
            return this.update(employee);
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Employee> listActiveEmployees() {
        String selectActiveProducts = "From Employee";
        return sessionFactory.getCurrentSession().createQuery(selectActiveProducts,Employee.class).getResultList();
    }

    @Override
    public List<Employee> listActiveEmployeesByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Employee> getLatestActiveEmployees(int count) {
        return null;
    }
}
