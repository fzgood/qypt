package com.qypt.department.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qypt.department.dao.DepartmentMapper;
import com.qypt.department.entity.Department;
import com.qypt.department.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public int deleteByPrimaryKey(Integer departmentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Department record) {
		return departmentMapper.insert(record);
	}

	@Override
	public int insertSelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Department selectByPrimaryKey(Integer departmentId) {
		return departmentMapper.selectByPrimaryKey(departmentId);
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
