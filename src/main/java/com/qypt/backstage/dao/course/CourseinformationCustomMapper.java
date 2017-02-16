package com.qypt.backstage.dao.course;

import java.util.List;

import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationCustom;

public interface CourseinformationCustomMapper {
	/**
	 * 查询所有课程信息
	 * @return
	 * @throws Exception
	 */
	public List<Courseinformation> selectCIAll(CourseinformationCustom course) throws Exception;
	
}
