package com.AttendenceManagementSystem.service;

import java.util.List;

import com.AttendenceManagementSystem.entities.AssignFaculty;

public interface AssignFacultyService {

	public long add(AssignFaculty entity);
	public void update(AssignFaculty entity);
	public void delete(AssignFaculty entity);
	public AssignFaculty findByName(String name);
	public AssignFaculty findByPk(long id);
	public List<AssignFaculty> search(AssignFaculty entity);
	
}
