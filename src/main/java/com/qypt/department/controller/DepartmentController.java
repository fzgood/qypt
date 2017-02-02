package com.qypt.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.department.entity.Department;
import com.qypt.department.service.DepartmentService;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/index")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("department/index");
		return modelAndView;
	}
	@RequestMapping(value="/add")
	public String add(Department department){
		try {
			departmentService.insert(department);
			return "redirect:/department/index";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/error";
		}
	}
	
}
