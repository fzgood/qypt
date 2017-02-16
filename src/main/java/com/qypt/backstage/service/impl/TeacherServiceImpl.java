package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.teacher.TeacherCustomMapper;
import com.qypt.backstage.dao.teacher.TeacherMapper;
import com.qypt.backstage.entity.teacher.Teacher;
import com.qypt.backstage.entity.teacher.TeacherCustom;
import com.qypt.backstage.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherCustomMapper tCustomMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Override
	public List<TeacherCustom> findTeacher(TeacherCustom teacherCustom) throws Exception {
		return tCustomMapper.selectTeacher(teacherCustom);
	}
	@Override
	public int addTeacher(Teacher teacher) throws Exception {
		return teacherMapper.insert(teacher);
	}
	@Override
	public Integer findCount(TeacherCustom teacherCustom) throws Exception {
		return tCustomMapper.selectCount(teacherCustom);
	}

}
