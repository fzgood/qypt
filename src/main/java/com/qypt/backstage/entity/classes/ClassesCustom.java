package com.qypt.backstage.entity.classes;

import com.qypt.backstage.entity.department.Department;

public class ClassesCustom extends Classes {

	private Department department;
	//当前页
		private Integer pageCurrent;
		//索引值
		private Integer pageIndex;
		//每页显示多少
		private Integer pageSize;
		//总页
		private Integer pageNum;
		public Integer getPageCurrent() {
			return pageCurrent;
		}
		public void setPageCurrent(Integer pageCurrent) {
			this.pageCurrent = pageCurrent;
		}
		public Integer getPageIndex() {
			return pageIndex;
		}
		public void setPageIndex(Integer pageIndex) {
			this.pageIndex = pageIndex;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
		public Integer getPageNum() {
			return pageNum;
		}
		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
			
}
