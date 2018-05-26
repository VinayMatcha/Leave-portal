package vinay.leaveportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import vinay.leaveportal.dao.EmployeeDAO;
import vinay.leaveportal.dao.UserDAO;
import vinay.leaveportal.entity.Employee;
import vinay.leaveportal.exception.EmployeeNotFoundException;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/show/employee/id")
    public @ResponseBody
    Employee showSingleEmployee (@QueryParam("id") int id) throws EmployeeNotFoundException {

        Employee employee = employeeDAO.get(id);
        return employee;
    }


    @RequestMapping(value = "/show/all/employees")
    public @ResponseBody List<Employee>  showAllEmployees () {
        List<Employee> employees = employeeDAO.listActiveEmployees();
        return employees;
    }


    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + employee.getFirstName());
        employeeDAO.add(employee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(employee.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
