package com.springbootrest.springbootrestAPI.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrestAPI.Entities.CourseEntity;
import com.springbootrest.springbootrestAPI.Services.CourseService;
import com.springbootrest.springbootrestAPI.Services.CourseServiceImpl;

@RestController
public class CourseController {

	@GetMapping("/home")
	public String getHome() {
		System.out.println("Inside Controller1");
		return "This is my first home";
	}

	CourseService courseService = new CourseServiceImpl();

//To Fetch all the courses	
	@GetMapping("/courses")
	public List<CourseEntity> getAllcourses() {
		System.out.println("Inside getAll");
		return courseService.getAllCourses();
	}

	// Single course
	@GetMapping("/courses/{CourseId}")
	public CourseEntity getSingleCourse(@PathVariable String CourseId) {
		System.out.println("Inside getSingle");
		return courseService.getServiceSinglecource(Long.parseLong(CourseId));
	}

//Add a course    
	@PostMapping("/courses")
	public CourseEntity postaddCourse(@RequestBody CourseEntity c) {

		System.out.println("Inside Post");
		return courseService.addServicePostaddCourse(c);

	}

	// Delete a course
	@DeleteMapping("/courses/{CourseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String CourseId) {
		System.out.println("Inside Delete");
		try {

			this.courseService.deleteCourseService(Long.parseLong(CourseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//Update a course    
	@PutMapping("/courses")
	public CourseEntity UpdateCourse(@RequestBody CourseEntity c) {
		return courseService.updateservice(c);
	}
}
