package com.qypt.backstage.dao.teacher;

import java.util.List;

import com.qypt.backstage.entity.teacher.TeacherCustom;

/**
 * @author fz
 */
public interface TeacherCustomMapper {
	/**
	 * 查询所有
	 * @param teacherCustom
	 * @return
	 * @throws Exception
	 */
	public List<TeacherCustom> selectTeacher(TeacherCustom teacherCustom) throws Exception;
	/**
	 * 查询多少条记录
	 * @param teacherCustom 查询对象
	 * @return 返回长度
	 * @throws Exception 异常处理
	 */			   
	public Integer selectCount(TeacherCustom teacherCustom) throws Exception;
}
