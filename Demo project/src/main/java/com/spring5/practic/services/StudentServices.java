package com.spring5.practic.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring5.practic.model.Student;


@Service
public class StudentServices {

	private static List<Student> students = new ArrayList<Student>();
	
	public Student creatUser(String name) {
		var user = new Student();
		user.setName(name);
		students.add(user);
		return user;
	}
	
	public void removeUserByName(String name) {

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
	}
	
	public void showAll() {
		students.forEach(System.out::print);
	}
	
}
