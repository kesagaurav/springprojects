package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor
public class EmployeeController {
	
	private EmployeeService es;
	
	
	@PostMapping("/home")
	public ResponseEntity<String> insertFood2(@RequestBody  @Valid Employee emp){
	es.addEmployee(emp);
	return new ResponseEntity<>("resource created",HttpStatus.CREATED);
	}
	
    @GetMapping("/home")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> list = es.findAllEmployee();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }
    
    @GetMapping("/home/{id}")
    public ResponseEntity<Optional<Employee>> getById(@PathVariable("id") int id){
    	if(es.getGauravById(id)==null) {
    		return new ResponseEntity<> (es.getGauravById(id),HttpStatus.NOT_FOUND);
    	}else {
    		return new ResponseEntity<>(es.getGauravById(id),HttpStatus.OK);
    	}
    }
    
    
    @DeleteMapping("/home/{Id}")
    public ResponseEntity<String> deleteBook(@PathVariable("Id") int Id){
    	es.deleteEmployee(Id);
    	return new ResponseEntity<>(HttpStatus.GONE);
    	}
	
	
	
	
	
}
