package com.edubridge.elite.main;

import com.edubridge.elite.service.StudentService;
import com.edubridge.elite.model.Student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service = new StudentService();
		Student[] students = service.getAllStudents();
		
		for(Student student : students) {
			System.out.println(student);
		}
	}

}
