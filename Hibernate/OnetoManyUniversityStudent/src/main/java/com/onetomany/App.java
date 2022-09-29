package com.onetomany;

import com.onetomany.daoimpl.UniversityDaoimpl;

public class App {
	public static void main(String[] args) {
		// Creating object of Dao Implementation class
		UniversityDaoimpl dao = new UniversityDaoimpl();
		dao.addUniversity();
		dao.fetchUniversity();

	}
}
