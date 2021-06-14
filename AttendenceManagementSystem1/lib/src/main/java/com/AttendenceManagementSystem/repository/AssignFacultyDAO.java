package com.AttendenceManagementSystem.repository;
import java.util.List;

import com.AttendenceManagementSystem.entities.AssignFaculty;

public interface AssignFacultyDAO {

	public long add(AssignFaculty entity);
	public void update(AssignFaculty entity);
	public void delete(AssignFaculty entity);
	public AssignFaculty findByName(String name);
	public AssignFaculty findByPk(long id);
	public List<AssignFaculty> search(AssignFaculty entity, long pageNo, int pageSize);
	public List<AssignFaculty> search(AssignFaculty entity);
	
}