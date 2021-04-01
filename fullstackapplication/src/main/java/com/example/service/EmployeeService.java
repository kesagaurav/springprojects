package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class EmployeeService {
	private EmployeeRepository emp;
	
	public List<Employee> findAllEmployee(){
		return emp.findAll();
	}
	
	public Employee addEmployee(Employee e) {
		Employee e1=emp.save(e);
		return e1;
		
	}
	
	public void deleteEmployee(int id) {
		emp.deleteById(id);
	
	}
	
	

    public Optional<Employee> getGauravById(int id) {
        return emp.findById(id);
    }
	
	
}
