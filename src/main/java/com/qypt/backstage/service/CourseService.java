package com.qypt.backstage.service;

import com.qypt.backstage.entity.course.Course;

public interface CourseService {
	/**
	 * 添加班级的课程
	 * @param course 课程对象
	 * @throws Exception
	 */
	public void addCourse(Course course) throws Exception;

}
