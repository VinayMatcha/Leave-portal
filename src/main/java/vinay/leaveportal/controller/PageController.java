package vinay.leaveportal.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vinay.leaveportal.dao.EmployeeDAO;
import vinay.leaveportal.dao.UserDAO;


@RestController
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


}