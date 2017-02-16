package com.qypt.backstage.service;

import java.util.List;

import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationCustom;

public interface CourseinfomationService {
	/**
	 * 查询所有课程信息
	 * @param id 系部ID
	 * @return 返回所有集合对象
	 * @throws Exception 异常处理
	 */
	public List<Courseinformation> findCIAll(CourseinformationCustom course) throws Exception;
	/**
	 * 添加课程信息
	 * @param courseinformation
	 * @throws Exception
	 */
	public void addCI(Courseinformation courseinformation) throws Exception;

}
