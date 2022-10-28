package com.shl.serviceimpl;

import com.shl.dao.StudentDao;
import com.shl.daoimpl.StudentDaoImpl;
import com.shl.entity.Student;
import com.shl.service.StudentService;

public class StudentServiceImpl implements StudentService {
		StudentDao studentdao=new StudentDaoImpl();
			
			
	public void addStudent(Student student) {
		studentdao.addStudent(student);//calling addstudent method of daoLayer
		
	}

}
