package vinay.leaveportal;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vinay.leaveportal.dao.EmployeeDAO;
import vinay.leaveportal.entity.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTestCase {

    private static AnnotationConfigApplicationContext context;

    private static EmployeeDAO employeeDAO;

    private Employee employee;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("vinay.leaveportal");
        context.refresh();
        employeeDAO = (EmployeeDAO)context.getBean("employeeDAO");
    }


    @Test
    public void testListActiveProducts() {
        assertEquals("Something went wrong while fetching the list of products!",
                1,employeeDAO.listActiveEmployees().size());
    }



}
