package com.springcrud.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springcrud.entity.Student;


// user repo extending JpaRepository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("select s from Student s where s.sfname = ?1")
	List<Student> getFname(String sfname);

	@Query("select s from Student s where s.slname = ?1")
	List<Student> getLname(String slname);
	
	@Query("select s from Student s where s.sphone = ?1")
	Student getPhone(long sphone);
}
