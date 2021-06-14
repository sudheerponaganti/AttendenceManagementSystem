package com.AttendenceManagementSystem.repository;

import java.util.List;

import com.AttendenceManagementSystem.entities.Subject;

public interface SubjectDAO {
	
	public long add(Subject entity);
	public void update(Subject entity);
	public void delete(Subject entity);
	public Subject findByName(String name);
	public Subject findByPk(long id);
	public List<Subject> search(Subject entity);

}
