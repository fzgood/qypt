package com.qypt.backstage.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.student.StudentCustomMapper;
import com.qypt.backstage.dao.student.StudentMapper;
import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.entity.student.StudentCustom;
import com.qypt.backstage.entity.student.StudentExample;
import com.qypt.backstage.service.StudentService;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private StudentCustomMapper customMapper;
	@Override
	public String findStudentById(Integer id) throws Exception {
		return customMapper.selectStudentById(id);
	}
	@Override
	public void addStudent(Student student) {
		studentMapper.insert(student);
	}
	@Override
	public List<StudentCustom> findStudentAll(StudentCustom student)
			throws Exception {
		return customMapper.selectStudentAll(student);
	}
	@Override
	public void editStudent(Student student) {
		studentMapper.updateByPrimaryKey(student);
	}
	@Override
	public List<Student> findStudentByName(String name) {
		StudentExample example=new StudentExample();
		example.createCriteria().andStudentNameEqualTo(name);
		return studentMapper.selectByExample(example);
	}
	@Override
	public void editStudentPhoto(Student s) throws Exception {
		customMapper.updateStudentPhoto(s);		
	}

}
