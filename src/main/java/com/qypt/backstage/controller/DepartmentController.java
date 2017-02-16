package com.qypt.backstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.service.DepartmentService;

/**
 * @author fz
 */
@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		List<Department> departmentAll;
		try {
			departmentAll = departmentService.findDepartmentAll();
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.setViewName("department/departmentIndex");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}
	@RequestMapping(value = "/add")
	public String add(Department department) {
		try {
			departmentService.addDepartment(department);
			return "redirect:/department/index";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/error";
		}
	}

}
