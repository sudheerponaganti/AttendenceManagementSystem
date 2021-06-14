package com.AttendenceManagementSystem.service;

import java.util.List;

import com.AttendenceManagementSystem.entities.Subject;

public interface SubjectService {
	public long add(Subject entity);
	public void update(Subject entity);
	public void delete(Subject entity);
	public Subject findByName(String name);
	public Subject findByPk(long id);
	public List<Subject> search(Subject entity);

}
