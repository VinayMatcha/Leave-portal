package vinay.leaveportal.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vinay.leaveportal.dao.HolidayDAO;
import vinay.leaveportal.entity.Holiday;

import java.util.List;

@Repository("holidayDAO")
@Transactional
public class HolidayDAOImpl implements HolidayDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Holiday holiday) {
        return false;
    }

    @Override
    public boolean update(Holiday holiday) {
        return false;
    }

    @Override
    public boolean delete(Holiday holiday) {
        return false;
    }

    @Override
    public List<Holiday> listHolidays() {
        return sessionFactory.getCurrentSession().createQuery("From Holiday",Holiday.class).getResultList();
    }

    @Override
    public List<Holiday> listHolidaysByYear(int year) {
        String selectHolidaysByYear = "From Holiday where year=:" + year;
        return sessionFactory.getCurrentSession().createQuery("From Holiday",Holiday.class).getResultList();
    }
}
