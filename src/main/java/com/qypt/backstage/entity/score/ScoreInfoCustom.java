package com.qypt.backstage.entity.score;

import com.qypt.backstage.entity.classes.ClassesCustom;
import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.student.StudentCustom;

public class ScoreInfoCustom extends ScoreInfo {
	private Score score;
	private StudentCustom student;
	private ClassesCustom classes;
	private Courseinformation courseinformation;
	
	private String linux;
	private String php;
	private String java;
	private String jquery;
	private String wlyx;
	private String hkgf;

	public ClassesCustom getClasses() {
		return classes;
	}

	public void setClasses(ClassesCustom classes) {
		this.classes = classes;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public StudentCustom getStudent() {
		return student;
	}

	public void setStudent(StudentCustom student) {
		this.student = student;
	}

	public Courseinformation getCourseinformation() {
		return courseinformation;
	}

	public void setCourseinformation(Courseinformation courseinformation) {
		this.courseinformation = courseinformation;
	}

	public String getLinux() {
		return linux;
	}

	public void setLinux(String linux) {
		this.linux = linux;
	}

	public String getPhp() {
		return php;
	}

	public void setPhp(String php) {
		this.php = php;
	}

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getJquery() {
		return jquery;
	}

	public void setJquery(String jquery) {
		this.jquery = jquery;
	}

	public String getWlyx() {
		return wlyx;
	}

	public void setWlyx(String wlyx) {
		this.wlyx = wlyx;
	}

	public String getHkgf() {
		return hkgf;
	}

	public void setHkgf(String hkgf) {
		this.hkgf = hkgf;
	}

}
