package vinay.leaveportal.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
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

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Users user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getName());
        userDAO.add(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getLoginId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

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