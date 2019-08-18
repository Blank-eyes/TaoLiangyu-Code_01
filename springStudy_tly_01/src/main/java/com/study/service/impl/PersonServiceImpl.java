package com.study.service.impl;

import org.springframework.stereotype.Service;

import com.study.service.PersonService;
@Service("personService")
public class PersonServiceImpl implements PersonService {

	public void walk() {

		System.out.println("i'am walking to work");
	}

}
