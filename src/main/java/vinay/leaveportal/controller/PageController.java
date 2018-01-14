package vinay.leaveportal.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vinay.leaveportal.dao.EmployeeDAO;
import vinay.leaveportal.dao.UserDAO;
import vinay.leaveportal.entity.Employee;
import vinay.leaveportal.entity.Holiday;
import vinay.leaveportal.exception.EmployeeNotFoundException;

import java.util.List;


@Controller

public class PageController {


    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("title","home");
        mv.addObject("userClickLogin","true");
        return mv;
    }



    @RequestMapping(value = "/about")
    public ModelAndView about() {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","About us");
        mv.addObject("userClickAbout","true");
        return mv;
    }



    @RequestMapping(value = "/contact")
    public ModelAndView contact() {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Contact Us");
        mv.addObject("userClickContact","true");
        return mv;
    }


    @RequestMapping(value = "/show/all/employees")
    public ModelAndView showAllEmployees () {

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","All products");
        List<Employee> employees = employeeDAO.listActiveEmployees();
        mv.addObject("employees",employees);
        mv.addObject("userClickAllEmployees","true");
        return mv;
    }


//    @RequestMapping(value = "/show/all/holidays")
//    public ModelAndView showAllEmployees () {
//
//        ModelAndView mv = new ModelAndView("page");
//        mv.addObject("title","All products");
//        mv.addObject("userClickAllEmployees","true");
//        List<Holiday> holidays = holidayDao.listHolidays();
//        mv.addObject("holidays",holidays);
//
//        return mv;
//    }


    @RequestMapping(value = "/show/{id}/employee")
    public ModelAndView showSingleEmployee (@PathVariable("id") int id ) throws EmployeeNotFoundException{

        ModelAndView mv = new ModelAndView("page");
        Employee employee = employeeDAO.get(id);
        if(employee == null){
            throw new EmployeeNotFoundException();
        }
        mv.addObject("title",employee.getId());
        mv.addObject("Employee", employee);
        mv.addObject("userClickShowEmployee","true");
        return mv;
    }


}