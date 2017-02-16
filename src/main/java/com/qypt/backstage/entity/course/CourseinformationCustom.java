package com.qypt.backstage.entity.course;

import com.qypt.backstage.entity.department.Department;

public class CourseinformationCustom extends Courseinformation {

	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
