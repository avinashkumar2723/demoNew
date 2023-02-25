package com.example.demo;

import com.example.demo.EmployeeRepo;
import jakarta.transaction.Transactional;
import com.example.demo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> listAll() {
        return employeeRepo.findAll();
    }

    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee get(Integer id) {
        return employeeRepo.findById(id).get();
    }

    public void delete(Integer id) {
        employeeRepo.deleteById(id);
    }
}
