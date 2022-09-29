package com.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetomany.config.HibernateUtil;
import com.onetomany.dao.UniversityDao;
import com.onetomany.entity.Students;
import com.onetomany.entity.University;

import jakarta.persistence.Query;

public class UniversityDaoimpl implements UniversityDao {

	// creating session object
	Session session = HibernateUtil.getSessionFactory().openSession();
	// creating transaction object
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")
	public void addUniversity() {
		// Adding student details in student object
		Students s1 = new Students(1700161902, "Sayan", "Das", "EE", "sayan@gmail.com");
		Students s2 = new Students(1700161901, "Owasim", "Chowdhury", "EE", "owasim@gmail.com");
		Students s3 = new Students(1700161908, "Sankhajit", "Roy", "CSE", "samkha@gmail.com");
		Students s4 = new Students(1700161909, "Akash", "Singh", "CSE", "akash@gmail.com");

		// Creating array-list to add all student object in array-list
		ArrayList<Students> s_all = new ArrayList<Students>();
		s_all.add(s1);
		s_all.add(s2);
		s_all.add(s3);
		s_all.add(s4);

		// Adding university details in university object
		University u = new University(7121, "IMPS College", "West Bengal", "India", s_all);

		// Saving session
		session.save(u);
		t.commit();

	}

	public void fetchUniversity() {
		// Creating query
		Query q = session.createQuery("from University");
		// List with university entity
		List<University> al = q.getResultList();

		// traverse
		Iterator<University> itr = al.iterator();

		while (itr.hasNext()) {
			University u1 = itr.next();
			System.out.println(u1);

		}
	}

}
