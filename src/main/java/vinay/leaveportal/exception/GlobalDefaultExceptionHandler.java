package vinay.leaveportal.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.PrintWriter;
import java.io.StringWriter;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handlerNohandlerFoundException(){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","the age is not constructued");
        mv.addObject("errorDescription","the page you are looking for is not found");
        mv.addObject("title","404 error page");
        return mv;
    }


    @ExceptionHandler(EmployeeNotFoundException.class)
    public ModelAndView handlerEmployeeNotFoundException(){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","Employee not avialable");
        mv.addObject("errorDescription","the Employee you are looking for is not avaialbale as of now");
        mv.addObject("title","Employee unavailable");
        return mv;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handlerException(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","Contact your administrator");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        mv.addObject("errorDescription",sw.toString());
        mv.addObject("title","error");
        return mv;
    }

}

