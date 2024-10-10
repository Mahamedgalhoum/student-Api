package com.courseapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private Long studentId;

	@Column(name = "studentName")
	private String studentName;

	@Column(name = "address")
	private String address;

	@Column(name = "sex")
	private String sex;
	
	
	public Student() {
		
	}

	public Student(Long studentId, String studentName, String address, String sex) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.sex = sex;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + ", sex="
				+ sex + "]";
	}
	

}
