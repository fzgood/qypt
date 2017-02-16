package com.qypt.backstage.service;

import java.util.List;

import com.qypt.backstage.entity.classes.Classes;
import com.qypt.backstage.entity.classes.ClassesCustom;

public interface ClassesService {
	/**
	 * 添加班级
	 * 
	 * @param record
	 *            班级对象
	 * @return 返回成功值
	 * @throws Expception
	 *             异常处理
	 */
	public int addClasses(Classes record) throws Exception;

	/**
	 * 
	 * @param classesCustom
	 * @return
	 * @throws Exception
	 */
	public List<Classes> findClassesAll(ClassesCustom classesCustom)
			throws Exception;

	/**
	 * 查询记录数量
	 * 
	 * @param classesCustom
	 *            查询对象
	 * @return 返回数量
	 * @throws Exception
	 *             异常处理
	 */
	public Integer findCount(ClassesCustom classesCustom) throws Exception;

	/**
	 * 修改班级信息
	 * 
	 * @param classes
	 *            修改对象
	 * @throws Exception
	 *             异常处理
	 */
	public void editClasses(Classes classes) throws Exception;

	/**
	 * 
	 * @param id 主键
	 * @return 返回对象
	 * @throws Exception 异常处理
	 */
	public Classes findClasses(Integer id) throws Exception;
	/**
	 * 根据院系ID 查找院系所有班级
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Classes> findClassByDepartmentId(Integer id) throws Exception;
	/**
	 * 查询所有班级
	 * @return 返回班级集合
	 * @throws Exception 异常处理
 	 */
	public List<Classes> findClassAll() throws Exception;
}
