package com.springcrud.service;

import java.util.List;

import com.springcrud.entity.Student;


//abstract method for performing CRUD on user entity
public interface StudentService {
	
	//saving details of user 
	Student saveUser(Student user);
	
	//getting all details of user 
	List<Student> getAllUser();
	
	//getting details of user based on uid
	Student getUserById(int sid);
	
	//getting details of user based on uid & change mentioned details 
	Student updateUserById(Student user, int sid);
	
	//getting details of user based on uid & delete mentioned user
	void deleteUserById(int sid);
	
	
	List<Student> getFname(String sfname);

	List<Student> getLname(String slname);
	
	Student getPhone(long sphone);

}
