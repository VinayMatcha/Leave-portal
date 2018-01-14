package vinay.leaveportal.exception;


import java.io.Serializable;



public class EmployeeNotFoundException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;
    private  String message;

    public EmployeeNotFoundException(){
        this("Employee is not available");

    }


    public EmployeeNotFoundException(String message){
        this.message = System.currentTimeMillis() + ":" + message;
    }


    public String getMessage() {
        return message;
    }
}
