package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public List <Employee> employee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bobby Tables",50000,"Accounting"));
        return employees;
    }

}
