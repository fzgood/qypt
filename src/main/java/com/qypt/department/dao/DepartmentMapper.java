package com.qypt.department.dao;

import com.qypt.department.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentId);
    
    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}