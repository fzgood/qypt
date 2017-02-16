package com.qypt.backstage.service;

import java.util.List;

import com.qypt.backstage.entity.score.Score;

public interface ScoreService {
	/**
	 * 添加一个成绩表
	 * @param score 成绩表对象
	 * @throws Expcetion 异常处理
	 */
	public void add(Score score) throws Exception;
	/**
	 * 查询所有成绩表
	 * @return 返回集合
	 * @throws Exception 异常处理
	 */
	public List<Score> findScore() throws Exception;

}
