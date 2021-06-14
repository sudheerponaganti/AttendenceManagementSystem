package com.AttendenceManagementSystem.service;
import java.util.List;

import com.AttendenceManagementSystem.entities.Course;

public interface CourseService {

	public long add(Course entity);
	public void update(Course entity);
	public void delete(Course entity);
	public Course findByName(String name);
	public Course findByPk(long id);
	public List<Course> search(Course entity);
}
