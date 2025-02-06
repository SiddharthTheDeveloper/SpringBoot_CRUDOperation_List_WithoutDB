package com.springbootrest.springbootrestAPI.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseEntity {
	@Id
	private long courseID;
	private String courseName;
	private String description;
	
	public long getCourseID() {
		return courseID;
	}
	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//parametrized constructor
	public CourseEntity(long courseID, String courseName, String description) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.description = description;
	}
	@Override
	public String toString() {
		return "CourseEntity [courseID=" + courseID + ", courseName=" + courseName + ", description=" + description
				+ "]";
	}
	//Default Constructor
	public CourseEntity() {
		super();
	}

}
