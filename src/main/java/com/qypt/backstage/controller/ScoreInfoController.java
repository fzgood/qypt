package com.qypt.backstage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationCustom;
import com.qypt.backstage.entity.score.ScoreInfo;
import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.service.CourseinfomationService;
import com.qypt.backstage.service.ScoreInfoService;
import com.qypt.backstage.service.StudentService;

@Controller
@RequestMapping(value = "/scoreinfo")
public class ScoreInfoController {
	@Autowired
	private CourseinfomationService courseinfomationService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private ScoreInfoService scoreInfoService;

	@RequestMapping(value = "/add")
	public ModelAndView add(Integer departmentId,Integer scoreId) {
		ModelAndView modelAndView = new ModelAndView();
		CourseinformationCustom course = new CourseinformationCustom();
		course.setDepartmentId(departmentId);
		try {
			List<Courseinformation> ciAll = courseinfomationService
					.findCIAll(course);
			modelAndView.addObject("ciAll", ciAll);
			modelAndView.addObject("scoreId", scoreId);
			modelAndView.setViewName("score/score_depart/add");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("/error");
			return modelAndView;
		}
	}

	@RequestMapping(value = "/addStudentScore")
	public String addStudentScore(String studentName,Integer[] ciId, Double[] fraction,Integer scoreId,HttpServletRequest request) {
		List<Student> findStudentByName = studentService.findStudentByName(studentName);
		if (findStudentByName.size()==0) {
			request.setAttribute("studentNull", "找不到此学生信息，请重新填写");
			return "forward:/scoreinfo/add";
		}
		Student student = findStudentByName.get(0);
		List<ScoreInfo> scoreInfo=new ArrayList<ScoreInfo>();
		for(int i=0;i<ciId.length;i++){
			ScoreInfo info=new ScoreInfo();
			info.setStudentId(student.getStudentId());
			info.setCiId(ciId[i]);
			info.setFraction(fraction[i]);
			info.setScoreId(1);
			scoreInfo.add(info);
		}
		try {
			scoreInfoService.addStudentScoreInfo(scoreInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
