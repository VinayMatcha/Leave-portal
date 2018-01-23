package vinay.leaveportal.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vinay.leaveportal.dao.UserDAO;
import vinay.leaveportal.entity.Users;

@RestController
public class UserController {

    private UserDAO userDAO;

    @Autowired
    @Qualifier(value="userDAO")
    public void setService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @RequestMapping(value = "/adduser")
    public String addUser(@ModelAttribute("userModel") Users user, Model model, HttpServletResponse response) {
        System.out.println("Adding user ---- > "+user);
        userDAO.add(user);
        return "redirect:/displayusers";
    }

    @RequestMapping(value = "/displayusers")
    public @ResponseBody List<Users> displayUsers(Model model) {
        List<Users> userList = userDAO.list();
        System.out.println("Displaying users" +userList);
        return userList;
    }

//    @RequestMapping(value = "/showform")
//    public String userForm(Model model) {
//        Users user = new Users();
//        model.addAttribute("userModel", user);
//        System.out.println("Entered Controller");
//        return "adduser";
//    }

    @RequestMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam("id") int id,Model model,HttpServletResponse response) {
        System.out.println("Delete user with id : "+id);
        Users user = userDAO.get(id);
        System.out.println("Delete Object : "+user);
        userDAO.delete(user);
        return "redirect:/displayusers";

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginUser(@RequestParam("username") String mail,
                            @RequestParam("password") String password,
                            Model model){


        return "emphome";
    }
}