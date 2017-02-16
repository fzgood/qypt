package com.qypt.backstage.entity.teacher;

import com.qypt.backstage.entity.department.Department;

/**
 * @author fz
 */
public class TeacherCustom extends Teacher {

	private Department department;
	private Integer pageUp;
	private Integer pageDown;
	private Integer pageCurrrnt;
	private int pageNum;

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public Integer getPageUp() {
		return pageUp;
	}

	public void setPageUp(Integer pageUp) {
		this.pageUp = pageUp;
	}

	public Integer getPageDown() {
		return pageDown;
	}

	public void setPageDown(Integer pageDown) {
		this.pageDown = pageDown;
	}

	public Integer getPageCurrrnt() {
		return pageCurrrnt;
	}

	public void setPageCurrrnt(Integer pageCurrrnt) {
		this.pageCurrrnt = pageCurrrnt;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
}
