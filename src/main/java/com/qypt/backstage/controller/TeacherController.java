package com.qypt.backstage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.entity.teacher.Teacher;
import com.qypt.backstage.entity.teacher.TeacherCustom;
import com.qypt.backstage.service.DepartmentService;
import com.qypt.backstage.service.TeacherService;

@Controller
@RequestMapping(value="/teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/index")
	public ModelAndView index(TeacherCustom teacherCustom){
		ModelAndView modelAndView = new ModelAndView();
		if(teacherCustom.getPageCurrrnt()==null){
			teacherCustom.setPageCurrrnt(1);
		}
		teacherCustom.setPageDown(teacherCustom.getPageCurrrnt()*10);
		teacherCustom.setPageUp(teacherCustom.getPageDown()-10);
		try {
			Integer count = teacherService.findCount(teacherCustom);
			if(count%10==0){
				teacherCustom.setPageNum(count/10);
			}else{
				teacherCustom.setPageNum((count/10)+1);
			}
			List<TeacherCustom> teacherAll = teacherService.findTeacher(teacherCustom);
			List<Department> departmentAll = departmentService.findDepartmentAll();
			if(!(teacherCustom.getDepartmentId()==null)){
				Department department = departmentService.findDepartmentById(teacherCustom.getDepartmentId());
				modelAndView.addObject("department", department);
			}
			modelAndView.setViewName("teacher/teacherIndex");
			modelAndView.addObject("teacherAll", teacherAll);
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.addObject("teacherCustom", teacherCustom);
			return modelAndView;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return modelAndView;
		}
	}
	@RequestMapping(value="/add")
	public String add(HttpServletRequest request,Teacher teacher){
		if(!"0".equals(teacher.getDepartmentId())&&"".equals(teacher.getTeacherName())){
			request.setAttribute("error", "请输入部门和老师姓名");
			return "forward:/teacher/index";
		}
		try {
			teacherService.addTeacher(teacher);
			return "redirect:/teacher/index";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/error";
		}
	}

}
