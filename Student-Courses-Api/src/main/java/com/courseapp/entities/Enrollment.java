package com.courseapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Enrollment")

public class Enrollment {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enrollmentId")
	private Long enrollmentId;

	@ManyToOne
	@JoinColumn(name = "studentId", nullable = false)
	private Student student;

	@ManyToOne
	@JoinColumn(name = "courseId", nullable = false)
	private Course course;

	
	public Long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", student=" + student.toString() + ", course=" + course.toString() + "]";
	}
	
	
}
