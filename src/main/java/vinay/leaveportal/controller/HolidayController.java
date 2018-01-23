package vinay.leaveportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import vinay.leaveportal.dao.HolidayDAO;
import vinay.leaveportal.entity.Holiday;
import vinay.leaveportal.entity.Users;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
public class HolidayController {

    @Autowired
    private HolidayDAO holidayDAO;


    @RequestMapping(value = "/add/holiday", method = RequestMethod.POST)
    public @ResponseBody String addHoliday(@RequestBody Holiday holiday) {
        String response = "success";
        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return response;
    }

    @RequestMapping(value = "/show/all/holidays")
    public @ResponseBody List<Holiday> showAllHolidays() {
        List<Holiday> holidayList = holidayDAO.listHolidays();
        System.out.println("Displaying Holidays" +holidayList);
        return holidayList;
    }

    @RequestMapping(value = "/show/holidays")
    public @ResponseBody List<Holiday> showAllHolidays(@QueryParam("year") int year) {
        List<Holiday> holidayList = holidayDAO.listHolidaysByYear(year);
        return holidayList;
    }


}
