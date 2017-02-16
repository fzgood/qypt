package com.qypt.backstage.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.qypt.backstage.entity.student.Student;
import com.qypt.backstage.service.StudentService;

@Controller
@RequestMapping(value = "/upload")
public class UploadController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/studentPhoto")
	public String upload(@RequestParam("photo") MultipartFile[] files,
			HttpServletRequest request, ModelMap model,String studentId) {
		if (files != null && files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				// 调用储存file的函数
				saveFile(request, file,studentId);
				model.put("name", file.getOriginalFilename());
			}
		}
		return "redirect:/student/index";
	}
	/*
	 * 存储file的函数
	 */
	private boolean saveFile(HttpServletRequest request, MultipartFile file,String studentId) {
		if (!file.isEmpty()) {
			try {
				//存储路径设置
				String realPath = request.getSession().getServletContext().getRealPath("");
				String path="upload\\"+studentId+"\\"+ file.getOriginalFilename();
				String filePath = realPath+"\\"+path;
				Student student=new Student();
				student.setStudentId(studentId);
				student.setImgUrl(path);
				studentService.editStudentPhoto(student);
				File saveDir = new File(filePath);
				if (!saveDir.getParentFile().exists()) {
					saveDir.getParentFile().mkdirs();
				}
				// 文件转存
				file.transferTo(saveDir);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
