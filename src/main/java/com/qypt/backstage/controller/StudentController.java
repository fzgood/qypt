package com.qypt.backstage.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.classes.Classes;
import com.qypt.backstage.entity.department.Department;
import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.entity.student.StudentCustom;
import com.qypt.backstage.service.ClassesService;
import com.qypt.backstage.service.DepartmentService;
import com.qypt.backstage.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private ClassesService classesService;
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/addStudent")
	public String addStudent(Student student) {
		try {
			String studentId = studentService.findStudentById(student
					.getDepartmentId());
			if (studentId == null) {
				student.setStudentId(student.getDepartmentId() + "0000001");
			} else {
				int parseInt = Integer.parseInt(studentId) + 1;
				student.setStudentId(String.valueOf(parseInt));
			}
			studentService.addStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "/error";
		}
		return "redirect:/student/index";
	}

	@RequestMapping(value = "/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Department> departmentAll = departmentService
					.findDepartmentAll();
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.setViewName("student/add");
			return modelAndView;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return modelAndView;
		}
	}

	@RequestMapping(value = "findClass")
	public String findClass(HttpServletRequest reuqest,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/json; charset=UTF-8");
		// 获取部门ID
		String departmentId = reuqest.getParameter("departmentId");
		Integer id = Integer.parseInt(departmentId);
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONArray array = new JSONArray();
		JSONObject member = null;
		try {
			// 根据部门的Id 来查找部门下的所有班级
			List<Classes> ClassesList = classesService
					.findClassByDepartmentId(id);
			for (Classes classes : ClassesList) {
				member = new JSONObject();
				member.put("classId", classes.getClassId());
				member.put("className", classes.getClassName());
				array.put(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print(array.toString());
		return null;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index(StudentCustom student){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<StudentCustom> studentAll = studentService.findStudentAll(student);
			List<Department> departmentAll = departmentService.findDepartmentAll();
			modelAndView.addObject("departmentAll", departmentAll);
			modelAndView.addObject("studentAll", studentAll);
			modelAndView.setViewName("student/studentIndex");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView edit(String studentId){
		ModelAndView modelAndView=new ModelAndView();
		StudentCustom student=new StudentCustom();
		student.setStudentId(studentId);
		try {
			List<StudentCustom> studentAll = studentService.findStudentAll(student);
			List<Classes> classAll = classesService.findClassAll();
			StudentCustom studentCustom = studentAll.get(0);
			modelAndView.addObject("student", studentCustom);
			modelAndView.addObject("classAll", classAll);
			modelAndView.setViewName("student/edit");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}
	@RequestMapping(value="/editover")
	public String editover(Student student){
		try {
			studentService.editStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/error";
		}
		return "redirect:/student/index";
	}
	@RequestMapping(value="/photo")
	public ModelAndView  photo(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("student/uploadPhoto");
		return modelAndView;
	}
}
