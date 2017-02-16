package com.qypt.backstage.dao.classes;

import java.util.List;

import com.qypt.backstage.entity.classes.Classes;

/**
 * @author fz
 */
public interface ClassesCustomMapper {
	/**
	 * 条件分页查询
	 * 
	 * @param classes
	 *            查询对象
	 * @return 返回集合对象
	 * @throws Exception
	 *             异常处理
	 */
	public List<Classes> selectClasses(Classes classes) throws Exception;

	/**
	 * 查询记录数
	 * 
	 * @param classes
	 *            条件
	 * @return 返回记录数
	 */
	public Integer selectCount(Classes classes);

}
