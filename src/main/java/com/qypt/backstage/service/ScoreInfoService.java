package com.qypt.backstage.service;

import java.util.List;

import com.qypt.backstage.entity.score.ScoreInfo;
import com.qypt.backstage.entity.score.ScoreInfoCustom;

public interface ScoreInfoService {
	/**
	 * 查询成绩明细
	 * @param scoreId 上学期还是下学期
	 * @return 返回集合
	 * @throws Exception 异常处理
	 */
	public List<ScoreInfoCustom> findScoreDepartment(Integer scoreId) throws Exception;
	/**
	 * 添加学生成绩
	 * @param scoreInfo 学生集合
	 * @throws Exception 
	 */
	public void addStudentScoreInfo(List<ScoreInfo> scoreInfo) throws Exception;
}
