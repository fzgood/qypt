package com.qypt.backstage.entity.student;

import com.qypt.backstage.entity.classes.Classes;
import com.qypt.backstage.entity.department.Department;

public class StudentCustom extends Student {

	private Department department;
	private Classes classes;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

}
