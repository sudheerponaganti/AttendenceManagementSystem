package com.AttendenceManagementSystem.service;

import java.util.List;

import com.AttendenceManagementSystem.entities.Attendence;

public interface AttendenceService {
	
	public long add(Attendence entity);
	public void update(Attendence entity);
	public void delete(Attendence entity);
	public Attendence findByName(String name);
	public Attendence findByPk(long id);
	public List<Attendence> search(Attendence entity);
	

}
