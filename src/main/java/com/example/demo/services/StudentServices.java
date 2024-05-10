package com.example.demo.services;
import com.example.demo.entities.Student;
import java.util.List;

public interface StudentServices {
	String addStudent(Student st);
	List<Student> fetchAllStudents();
	Student searchStudent(int univId);
	String updateStudent(Student st);
	String deleteStudent(int univId);
}
