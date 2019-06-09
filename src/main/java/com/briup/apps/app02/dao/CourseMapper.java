package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface CourseMapper {

    Course findById(long id);

    List<Course> selectAll();

    List<Course> query(Course course);

    void insert(Course course);

    void update(Course course);

    void deleteByPrimaryKey(long id);

}
