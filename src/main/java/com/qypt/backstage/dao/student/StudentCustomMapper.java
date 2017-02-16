package com.qypt.backstage.dao.student;

import java.util.List;

import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.entity.student.StudentCustom;

public interface StudentCustomMapper {
	/**
	 * 根据系部ID查询学生ID
	 * 
	 * @param id
	 *            系部iD
	 * @return 返回学生ID
	 * @throws Exception
	 *             异常处理
	 */
	public String selectStudentById(Integer id) throws Exception;

	/**
	 * 查询所有学生
	 * 
	 * @param student
	 *            学生条件
	 * @return 返回集合
	 * @throws Exception
	 *             异常处理
	 */
	public List<StudentCustom> selectStudentAll(StudentCustom student)
			throws Exception;

	/**
	 * 根据对象ID进行上传照片
	 * 
	 * @param s
	 *            对象
	 */
	public void updateStudentPhoto(Student s) throws Exception;

}
