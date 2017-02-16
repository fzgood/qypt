package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.score.ScoreMapper;
import com.qypt.backstage.entity.score.Score;
import com.qypt.backstage.entity.score.ScoreExample;
import com.qypt.backstage.service.ScoreService;

public class ScoreServiceImple implements ScoreService {
	@Autowired
	private ScoreMapper scoreMapper;

	@Override
	public void add(Score score) throws Exception {
		scoreMapper.insert(score);
	}

	@Override
	public List<Score> findScore() throws Exception {
		ScoreExample example=new ScoreExample();
		return scoreMapper.selectByExample(example);
	}

}
