package com.synex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synex.modal.Address;
import com.synex.modal.Student;
import com.synex.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping(value = "/getAllStudents")
	public List<Student> getAllStudents() {
		
		return studentService.getAllStudents();
	}
	
	@PutMapping(value = "/addStudent")
	public List<Student> addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	@PostMapping(value = "/updateStudent")
	public List<Student> updateStudent(@RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping(value = "/deleteStudent/{id}")
	public List<Student> deleteStudent(@PathVariable int id) {
		
		return studentService.deleteStudent(id);
	}
	
	@GetMapping(value = "/getAddress/{id}")
	public Address getAddress(@PathVariable int id) {
		
		return studentService.getAddress(id);
	}
	
	
	
}

/*package com.synex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synex.modal.Address;
import com.synex.modal.Student;

@RestController
public class StudentController {
	
	List<Student> studentList = new ArrayList<>();
	List<Address> addressList = new ArrayList<>();

	
	@GetMapping(value = "/getStudents")
	public List<Student> getStudents() {
		
		return studentList;
	}
	
	@GetMapping(value = "/getAddress")
	public List<Address> getAddress() {
		
		return addressList;
	}
	
	@PostMapping(value = "/postStudent")
	public List<Student> postStudents(@RequestBody Student student) {
		studentList.add(student);
		return studentList;
	}
	
	@PostMapping(value = "/postAddress")
	public List<Address> postAddress(@RequestBody Address address) {
		addressList.add(address);
		return addressList;
	}
	
}


*/


