package vinay.leaveportal.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vinay.leaveportal.dao.UserDAO;
import vinay.leaveportal.entity.Users;


@Repository("UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public Users get(int loginId) {
        try{
            return sessionFactory.getCurrentSession().get(Users.class, Integer.valueOf(loginId));
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Users> list() {
        return sessionFactory.getCurrentSession().createQuery("From Users",Users.class).getResultList();
    }

    @Override
    public boolean add(Users user) {
        try{
            sessionFactory.getCurrentSession().persist(user);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Users user) {
        try{
            sessionFactory.getCurrentSession().update(user);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Users user) {
        try{
            sessionFactory.getCurrentSession().delete(user);
            return true;
        }catch(Exception exc){
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Users> listUsersByAccessType() {
        return sessionFactory.getCurrentSession().createQuery("From Users",Users.class).getResultList();

    }

    @Override
    public List<Users> listUsers() {
        return null;
    }


}
