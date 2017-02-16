package com.qypt.backstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.classes.Classes;
import com.qypt.backstage.entity.classes.ClassesCustom;
import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.service.ClassesService;
import com.qypt.backstage.service.DepartmentService;

@Controller
@RequestMapping(value = "/classes")
public class ClassesController {
	@Autowired
	private ClassesService classesService;
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "index")
	public ModelAndView index(ClassesCustom classesCustom) {
		if(classesCustom.getPageCurrent()==null){
			classesCustom.setPageCurrent(1);
		}
		classesCustom.setPageIndex((classesCustom.getPageCurrent()-1)*10);
		ModelAndView modelAndView = new ModelAndView();
		try {
			Integer count = classesService.findCount(classesCustom);
			if(count%10!=0){
				classesCustom.setPageNum((count/10)+1);
			}else{
				classesCustom.setPageNum(count/10);
			}
			List<Department> departmentAll = departmentService.findDepartmentAll();
			modelAndView.setViewName("classes/classesIndex");
			List<Classes> classesAll = classesService.findClassesAll(classesCustom);
			modelAndView.addObject("classesCustom", classesCustom);
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.addObject("classesAll", classesAll);
			return modelAndView;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return modelAndView;
		}
	}

	@RequestMapping(value = "add")
	public String add(Classes classes) {
		try {
			classes.setState("未毕业");
			classesService.addClasses(classes);
			return "redirect:/classes/index";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/error";
		}
	}
	
	@RequestMapping(value="update")
	public ModelAndView update(Integer classId){
		ModelAndView modelAndView = new ModelAndView();
		try {
			Classes classes2 = classesService.findClasses(classId);
			Integer departmentId = classes2.getDepartmentId();
			Department department = departmentService.findDepartmentById(departmentId);
			modelAndView.addObject("classes2", classes2);
			modelAndView.addObject("department", department);
			modelAndView.setViewName("classes/update");
			return modelAndView;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return modelAndView;
		}
	}
	@RequestMapping(value="editover")
	public String editOver(Classes classes){
		try {
			classesService.editClasses(classes);
			return "redirect:/classes/index";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "/error";
		}
	}

}
