package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.classes.ClassesCustomMapper;
import com.qypt.backstage.dao.classes.ClassesMapper;
import com.qypt.backstage.entity.classes.Classes;
import com.qypt.backstage.entity.classes.ClassesCustom;
import com.qypt.backstage.entity.classes.ClassesExample;
import com.qypt.backstage.entity.classes.ClassesExample.Criteria;
import com.qypt.backstage.service.ClassesService;

public class ClassesServiceImpl implements ClassesService {
	@Autowired
	private ClassesMapper classesMapper;
	@Autowired
	private ClassesCustomMapper cCustomMapper;
	@Override
	public int addClasses(Classes record) throws Exception {
		return classesMapper.insert(record);
	}

	@Override
	public List<Classes> findClassesAll(ClassesCustom classesCustom) throws Exception {
		return cCustomMapper.selectClasses(classesCustom);
	}

	@Override
	public Integer findCount(ClassesCustom classesCustom) throws Exception {
		return cCustomMapper.selectCount(classesCustom);
	}

	@Override
	public void editClasses(Classes classes) throws Exception {
		classesMapper.updateByPrimaryKey(classes);
	}

	@Override
	public Classes findClasses(Integer id) throws Exception {
		return classesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Classes> findClassByDepartmentId(Integer id) throws Exception {
		ClassesExample example = new ClassesExample();
		Criteria criteria = example.createCriteria();
		criteria.andDepartmentIdEqualTo(id);
		return classesMapper.selectByExample(example);
	}

	@Override
	public List<Classes> findClassAll() throws Exception {
		ClassesExample example=new ClassesExample();
		return classesMapper.selectByExample(example);
	}


	

}
