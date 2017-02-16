package com.qypt.backstage.dao.score;

import java.util.List;

import com.qypt.backstage.entity.score.ScoreInfo;
import com.qypt.backstage.entity.score.ScoreInfoCustom;

public interface ScoreInfoCustomMapper {
	/**
	 * 查询成绩明细
	 * @param scoreId 成绩表ID
	 * @return 返回集合
	 * @throws Exception 异常处理
	 */
	public List<ScoreInfoCustom> selectScoreDepartment(Integer scoreId) throws Exception;
	/**
	 * 插入学生成绩
	 * @param scoreInfo
	 * @throws Exception
	 */
public void insertStudentScoreInfo(List<ScoreInfo> scoreInfo) throws Exception;

}
