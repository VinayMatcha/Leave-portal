package vinay.leaveportal;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import vinay.leaveportal.dao.UserDAO;

import vinay.leaveportal.entity.Users;

public class UsersTestCase {

    private static AnnotationConfigApplicationContext context;

    private static UserDAO userDAO;

    private Users user;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("vinay.leaveportal");
        context.refresh();
        userDAO = (UserDAO)context.getBean("UserDAO");
    }


    @Test
    public void insertEmployee(){
        Users user = new Users( "prasanth", "prasanthyarramasu@gmail.com", "0911@pras");
        assertEquals("Something went wrong while fetching the list of products!",
                true,userDAO.add(user));
    }

//    @Test
//    public void testListActiveProducts() {
//        List<Users> users = userDAO.list();
//        assertEquals("Something went wrong while fetching the list of products!",
//                3,users.size());
//        System.out.println(users);
//    }
//
//    @Test
//    public void updateUser(){
//        Users user = new Users(732939, "sumanth", "sumanth51194@gmail.com", "sumanth123");
//        assertEquals("Something went wrong while fetching the list of products!",
//                true,userDAO.update(user));
//    }
//
//    @Test
//    public void getUser(){
//        Users user = userDAO.get(732964);
//        assertEquals("Something went wrong while fetching the list of products!",
//                true,user!=null);
//        System.out.println(user);
//
//    }

}
