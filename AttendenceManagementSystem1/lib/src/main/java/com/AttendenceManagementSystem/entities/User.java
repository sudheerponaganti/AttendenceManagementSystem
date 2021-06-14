package com.AttendenceManagementSystem.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;



@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="roleId",
discriminatorType =DiscriminatorType.INTEGER)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Userid;
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private Date dob;
	private String mobileNo;
	private long roleId;
	private String gender;
	public User(String userid, String firstName, String lastName, String password, String confirmPassword, Date dob,
			String mobileNo, long roleId, String gender) {
		super();
		Userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.roleId = roleId;
		this.gender = gender;
	}
	
	
}
