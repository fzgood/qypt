package com.qypt.backstage.service;

import java.util.List;


import com.qypt.backstage.entity.teacher.Teacher;
import com.qypt.backstage.entity.teacher.TeacherCustom;

/**
 * @author fz
 */
public interface TeacherService {
	/**
	 * 查询所有老师信息
	 * 
	 * @return 返回集合对象
	 * @throws Exception
	 *             异常处理
	 */
	public List<TeacherCustom> findTeacher(TeacherCustom teacherCustom) throws Exception;

	/**
	 * 添加老师
	 * 
	 * @param teaher
	 *            老师对象
	 * @return 返回成功值
	 * @throws Exception
	 *             异常处理
	 */
	public int addTeacher(Teacher teaher) throws Exception;
	/**
	 * 
	 * @param teacherCustom
	 * @return
	 * @throws Exception
	 */
	public Integer findCount(TeacherCustom teacherCustom) throws Exception;
	

}
