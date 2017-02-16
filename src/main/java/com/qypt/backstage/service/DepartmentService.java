package com.qypt.backstage.service;

import java.util.List;


import com.qypt.backstage.entity.department.Department;

/**
 * @author fz
 */
public interface DepartmentService {
	/** 
	 * 查询所有部门
	 * @return 返回一个集合对象
	 * @throws Exception 异常处理
	 */
	public List<Department> findDepartmentAll() throws Exception;
	/**
	 * 添加部门信息
	 * @param department 部门对象
	 * @return 返回是否成功
	 * @throws Exception 异常处理
	 */
	public int addDepartment(Department department) throws Exception;
	/**
	 * 根据ID 查询部门
	 * @param id 部门ID
	 * @return 返回部门对象
	 * @throws Exception
	 */
	public Department findDepartmentById(Integer id) throws Exception;
	
}
