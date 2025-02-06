package com.springbootrest.springbootrestAPI.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootrest.springbootrestAPI.Entities.CourseEntity;
import com.springbootrest.springbootrestAPI.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	List<CourseEntity> course;

	public CourseServiceImpl() {

		course = new ArrayList<>();
		course.add(new CourseEntity(123, "Java", "Java API"));
		course.add(new CourseEntity(456, "React", "React API"));
		course.add(new CourseEntity(789, "JSF", "JSF API"));

	}

	@Override
	public List<CourseEntity> getAllCourses() {
		/*
		 * course = new ArrayList<>(); course.add(new CourseEntity(111, "Java",
		 * "Java API")); course.add(new CourseEntity(222, "React","React API"));
		 * course.add(new CourseEntity(333, "JSF", "JSF API"));
		 */

		return course;
	}

	CourseEntity course1 = null;

	@Override
	public CourseEntity getServiceSinglecource(long CourseID) {

		for (CourseEntity c : course) {
			if (c.getCourseID() == (CourseID)) {
				course1 = c;
				break;
			}

		}
		return course1;
	}

	@Override
	public CourseEntity addServicePostaddCourse(CourseEntity c) {
		course.add(c);
		return c;
	}

	CourseEntity course2 = null;

	@Override
	public CourseEntity deleteCourseService(long CourseID) {

		for (CourseEntity c1 : course) {
			if (c1.getCourseID() == CourseID)
				System.out.println("Before removal course Size= " + course.size());
			course.remove(c1);
			course2 = c1;
			System.out.println("After removal course Size= " + course.size());
			break;
		}
		return course2;

	}

	@Override
	public CourseEntity updateservice(CourseEntity c) {

		for (CourseEntity c1 : course) {
			System.out.println("Inside for");
			if (c1.getCourseID() == c.getCourseID()) {
				System.out.println("Inside condition");
				c1.setCourseName(c.getCourseName());
				c1.setDescription(c.getDescription());
			}

		}
		return c;
	}

}
