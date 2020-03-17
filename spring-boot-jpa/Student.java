package com.example.springbootjpa.model;

import javax.persistence.Entity;

@Entity
public class Student {


	private long  studentId;
	private String studentName;
	private Address address; 
}
