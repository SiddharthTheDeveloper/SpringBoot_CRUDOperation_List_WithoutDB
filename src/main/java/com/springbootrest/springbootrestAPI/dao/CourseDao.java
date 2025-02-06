package com.springbootrest.springbootrestAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.springbootrestAPI.Entities.CourseEntity;

public interface CourseDao extends JpaRepository<CourseEntity, Long> {

}
