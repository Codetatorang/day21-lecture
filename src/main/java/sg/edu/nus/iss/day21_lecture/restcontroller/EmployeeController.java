package sg.edu.nus.iss.day21_lecture.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import sg.edu.nus.iss.day21_lecture.model.Employee;
import sg.edu.nus.iss.day21_lecture.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService empSvc;

    @GetMapping
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> employees = empSvc.findAll();
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> save(@RequestBody Employee emp) {
        Boolean bResult = empSvc.save(emp);
        return new ResponseEntity<Boolean>(bResult, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Integer> update(@RequestBody Employee emp) {
        Integer iUpdated = empSvc.update(emp);
        return new ResponseEntity<Integer>(iUpdated, HttpStatus.OK);
    }

    @GetMapping("/{employee-id}")
    public ResponseEntity<Employee> findById(@PathVariable("employee-id") Integer id) {
        Employee employee = empSvc.findById(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);

    }

    @DeleteMapping("/{employee-id}")
    public ResponseEntity<Integer> delete(@PathVariable("employee-id") Integer id) {
        Integer iDeleted = empSvc.delete(id);
        return new ResponseEntity<Integer>(iDeleted, HttpStatus.OK);
    }
}
