package com.AttendenceManagementSystem.service;

import java.util.List;

import com.AttendenceManagementSystem.entities.User;

public interface UserService {
	
	public long add(User entity);
	public void update(User entity);
	public void delete(User entity);
	public User findByLogin(String login);
	public User findByPk(long id);
	public List<User> search(User entity);
	public User authenticate(User entity);
	public boolean changePassword(Long id, String oldPassword,
            String newPassword) ;
    public long registerUser(User entity);
    public boolean forgetPassword(String login);

}
