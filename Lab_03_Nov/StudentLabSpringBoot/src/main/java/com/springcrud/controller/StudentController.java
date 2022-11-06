package com.springcrud.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springcrud.entity.Student;
import com.springcrud.service.StudentService;


// user controller to handling all rest api incoming request
@RestController
public class StudentController {
	
	@Autowired
	private StudentService us;
	
	//save user in db table using rest api PostMapping
	@PostMapping("/save")
	public ResponseEntity<Student> saveUser(@Valid @RequestBody Student user){
		return new ResponseEntity<Student>(us.saveUser(user), HttpStatus.CREATED);
	}
	
	// fetch user details from db table using rest api GetMapping
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return us.getAllUser();
	}
	
	// fetch user details from db table using rest api GetMapping based on id
	@GetMapping("/getBySid/{sid}")
	public ResponseEntity<Student> getU(@PathVariable("sid") int sid){
		return new ResponseEntity<Student>(us.getUserById(sid),HttpStatus.OK);
	}
	
	//update user details in db table using rest api PutMapping based on id
	@PutMapping("/update/{sid}")
	public ResponseEntity<Student> updateUser(@PathVariable("sid") int sid, @RequestBody Student user){
			return new ResponseEntity<Student>(us.updateUserById(user, sid), HttpStatus.OK);
		}
		
		//delete user details in db table using rest api PutMapping based on id
	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<String> deleteUser(@PathVariable("sid") int sid){
		us.deleteUserById(sid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
				}
	@GetMapping("/getByFn/{sfname}")
	public List<Student> getFname(@PathVariable String sfname){
		return us.getFname(sfname);
	}
	
	@GetMapping("/getByLn/{slname}")
	public List<Student> getLname(@PathVariable String slname){
		return us.getLname(slname);
	}
	
	@GetMapping("/getByPh/{sphone}")
	public Student getPhone(@PathVariable long sphone){
		return us.getPhone(sphone);
	}
}
