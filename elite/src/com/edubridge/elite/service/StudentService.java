package com.edubridge.elite.service;

import com.edubridge.elite.model.Student;

public class StudentService {
	Student[] students;
	
	public StudentService() {
		students = new Student[] {
				new Student(1001, "Kavya", 9390757127L),
				new Student(1002, "Kalyani", 9121831652L),
				new Student(1003, "Yashu", 7893597301L),
				new Student(1004, "Sony", 8125371652L),
				new Student(1005, "Navya", 8179575398L)
				
		};
		
	}
	public Student[] getAllStudents() {
		return students;
	}
}

