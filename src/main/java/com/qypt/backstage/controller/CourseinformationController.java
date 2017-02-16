package com.qypt.backstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationCustom;
import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.service.CourseinfomationService;
import com.qypt.backstage.service.DepartmentService;

@Controller
@RequestMapping(value="/course")
public class CourseinformationController {
	@Autowired
	private CourseinfomationService courseinfomationService;
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/index")
	public ModelAndView index(CourseinformationCustom course){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Department> departmentAll = departmentService.findDepartmentAll();
			List<Courseinformation> CIAll = courseinfomationService.findCIAll(course);
			modelAndView.setViewName("course/courseIndex");
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.addObject("CIAll", CIAll);
			return modelAndView ;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}
	@RequestMapping(value="add")
	public String add(Courseinformation course){
		try {
			courseinfomationService.addCI(course);
			return "redirect:/course/index";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/error";
		}
	}
}
