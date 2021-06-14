package com.AttendenceManagementSystem.service;

import java.util.List;

import com.AttendenceManagementSystem.entities.Student;

public interface StudentService {
	
	public long add(Student entity);
	public void update(Student entity);
	public void delete(Student entity);
	public Student findByName(String name);
	public Student findByPk(long id);
	public List<Student> search(Student entity);

}
