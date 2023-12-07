package com.spring.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student Details")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studenName;
	
	@Column(name="student_city")
	private String studentCity;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudenName() {
		return studenName;
	}

	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student(int studentId, String studenName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studenName = studenName;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
