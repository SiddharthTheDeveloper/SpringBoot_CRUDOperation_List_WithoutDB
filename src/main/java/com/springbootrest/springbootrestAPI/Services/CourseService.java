package com.springbootrest.springbootrestAPI.Services;

import java.util.List;

import com.springbootrest.springbootrestAPI.Entities.CourseEntity;

public interface CourseService {

	public List<CourseEntity> getAllCourses();

	public CourseEntity getServiceSinglecource(long CourseID);

	public CourseEntity addServicePostaddCourse(CourseEntity c);

	public CourseEntity deleteCourseService(long CourseID);

	public CourseEntity updateservice(CourseEntity c);
	
}
