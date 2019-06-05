package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface ICourseService {
    Course findById(long id);

    List<Course> findAll();

    List<Course> query(Course course);
}
