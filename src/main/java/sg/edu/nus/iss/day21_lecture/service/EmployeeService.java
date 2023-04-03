package sg.edu.nus.iss.day21_lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day21_lecture.model.Employee;
import sg.edu.nus.iss.day21_lecture.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> findAll(){
        return empRepo.findAll();
    }

    public Boolean save(Employee emp){
        return empRepo.save(emp);
    }

    public Integer update(Employee emp){
        return empRepo.update(emp);
    }
    public Employee findById(Integer id){
        return empRepo.findByEmployeeId(id);
    }

    public int delete(Integer id){
        return empRepo.delete(id);
    }

}
