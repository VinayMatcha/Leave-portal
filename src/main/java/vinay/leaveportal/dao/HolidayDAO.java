package vinay.leaveportal.dao;

import vinay.leaveportal.entity.Holiday;

import java.util.List;

public interface HolidayDAO {

    boolean add(Holiday holiday);
    boolean update(Holiday holiday);
    boolean delete(Holiday holiday);

    List<Holiday> listHolidays();
    List<Holiday> listHolidaysByYear(int year);

}
