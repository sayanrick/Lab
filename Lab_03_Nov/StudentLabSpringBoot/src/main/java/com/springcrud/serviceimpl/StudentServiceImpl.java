package com.springcrud.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.entity.Student;
import com.springcrud.exception.StudentNotFoundException;
import com.springcrud.repositoy.StudentRepository;
import com.springcrud.service.StudentService;

@Service
// implementing all method of user service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository urepo;
	
	//saving user details using save() of jpaRepository
	@Override
	public Student saveUser(Student user) {
		
		return urepo.save(user);
		

	}

	// fetching all user details using finalAll() of JpaRepository
	@Override
	public List<Student> getAllUser() {
		
		return urepo.findAll();
	}

	// fetching user details based on id using findById() of JpaRepository, if not found throw exception
	@Override
	public Student getUserById(int sid) {
	
		return urepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no user exists in table"));
	}

	// fetching user details based on id using findById() of JpaRepository, if not found throw exception
	//& update any contact details of user
	@Override
	public Student updateUserById(Student user, int sid) {
		Student newuser = urepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no user exists in table"));

		// updated value
		newuser.setSemail(user.getSemail());
		newuser.setSphone(user.getSphone());
		urepo.save(newuser);
		return newuser;
	}

	// fetching user details based on id using findById() of JpaRepository, if not found throw exception
// delete enter user id
	@Override
	public void deleteUserById(int sid) {
		
		urepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no student exists in table"));
		urepo.deleteById(sid);
	}

	@Override
	public List<Student> getFname(String sfname) {
		
		return urepo.getFname(sfname);
	}

	@Override
	public List<Student> getLname(String slname) {
		
		return urepo.getLname(slname);
	}

	@Override
	public Student getPhone(long sphone) {
		
		return urepo.getPhone(sphone);
	}

}
