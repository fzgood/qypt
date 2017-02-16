package com.qypt.backstage.service;

import java.util.List;

import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.entity.student.StudentCustom;


public interface StudentService {
	/**
	 * 根据院系ID查询该院系有没有学生
	 * @param id 院系ID
	 * @return 返回一个学生ID
	 * @throws Exception 异常处理
	 */
	public String findStudentById(Integer id) throws Exception;

	/**
	 * 添加学生
	 * @param student 学生对象
	 */
	public void addStudent(Student student);
	/**
	 * 查询所有学生
	 * @param student 学生条件
	 * @return 返回集合
	 * @throws Exception 异常处理
	 */
	public List<StudentCustom> findStudentAll(StudentCustom student) throws Exception;
	/**
	 * 修改学生信息
	 * @param student 学生条件
	 */
	public void editStudent(Student student);
	/**
	 * 根据名字查询学生是否存在
	 * @param name 学生名字
	 * @return  返回学生对象
	 */
	public List<Student> findStudentByName(String name);
	/**
	 * 根据学生对象上传图片
	 * @param s 学生对象
	 * @throws Exception 
	 */
	public void editStudentPhoto(Student s) throws Exception;
	
}
