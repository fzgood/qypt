package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.department.DepartmentMapper;
import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.entity.department.DepartmentExample;
import com.qypt.backstage.service.DepartmentService;
/**
 * @author fz
 */
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> findDepartmentAll() throws Exception {
		DepartmentExample example = null;
		return departmentMapper.selectByExample(example);
	}

	@Override
	public int addDepartment(Department department) throws Exception {
		return departmentMapper.insert(department);
	}

	@Override
	public Department findDepartmentById(Integer id) throws Exception {
		return departmentMapper.selectByPrimaryKey(id);
	}

}
