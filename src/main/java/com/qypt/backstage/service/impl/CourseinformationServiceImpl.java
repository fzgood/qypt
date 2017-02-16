package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.course.CourseinformationCustomMapper;
import com.qypt.backstage.dao.course.CourseinformationMapper;
import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationCustom;
import com.qypt.backstage.service.CourseinfomationService;

public class CourseinformationServiceImpl implements CourseinfomationService {
	@Autowired
	private CourseinformationMapper ciMapper;
	@Autowired
	private CourseinformationCustomMapper customMapper;
	@Override
	public List<Courseinformation> findCIAll(CourseinformationCustom course) throws Exception {
		return customMapper.selectCIAll(course);
	}
	@Override
	public void addCI(Courseinformation courseinformation) throws Exception {
		ciMapper.insert(courseinformation);
	}

}
