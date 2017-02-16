package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.score.ScoreInfoCustomMapper;
import com.qypt.backstage.entity.score.ScoreInfo;
import com.qypt.backstage.entity.score.ScoreInfoCustom;
import com.qypt.backstage.service.ScoreInfoService;

public class ScoreInfoServiceImple implements ScoreInfoService {
	@Autowired
	private ScoreInfoCustomMapper customMapper;

	@Override
	public List<ScoreInfoCustom> findScoreDepartment(Integer scoreId)
			throws Exception {
		return customMapper.selectScoreDepartment(scoreId);
	}

	@Override
	public void addStudentScoreInfo(List<ScoreInfo> scoreInfo) throws Exception {
		customMapper.insertStudentScoreInfo(scoreInfo);
	}
}
