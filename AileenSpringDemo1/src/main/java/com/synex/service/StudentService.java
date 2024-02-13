package com.synex.service;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

import com.synex.modal.Address;
import com.synex.modal.Student;

@Service
public class StudentService {

	List<Student> studentList = new CopyOnWriteArrayList<>();
	
	public List<Student> getAllStudents() {
		return studentList;
	}
	
	public List<Student> addStudent(Student student) {
		studentList.add(student);
		return studentList;
	}
	
	public List<Student> deleteStudent(int id) {
		studentList.removeIf(student -> student.getId() == id);
		return studentList;
	}
	
	public List<Student> updateStudent(Student updateStudent) {
		Iterator<Student> itr = studentList.iterator();
		while(itr.hasNext()) {
			Student student = itr.next();
			if(updateStudent.getId() == student.getId()) {
				studentList.remove(student);
				studentList.add(updateStudent);
			}
		}
		return studentList;
	}
	
	public Address getAddress(int id) {
		for (Student student : studentList) {
			if (student.getId() == id) {
				return student.getAddress();
			}
		}
		return null;
	}
}
