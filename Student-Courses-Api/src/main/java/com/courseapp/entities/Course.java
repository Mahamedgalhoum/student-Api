package com.courseapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseId")
	private Long courseId;

	@Column(name = "courseName")
	private String courseName;

	@Column(name = "courseDuration")
	private int courseDuration;


	public Course() {

	}

	public Course(Long courseId, String courseName, int courseDuration) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}	
	
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ "]";
	}
	
	
}
