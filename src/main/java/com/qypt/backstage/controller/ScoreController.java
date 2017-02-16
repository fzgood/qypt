package com.qypt.backstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qypt.backstage.entity.score.Score;
import com.qypt.backstage.entity.score.ScoreInfoCustom;
import com.qypt.backstage.service.ScoreInfoService;
import com.qypt.backstage.service.ScoreService;

@Controller
@RequestMapping(value = "/score")
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
	@Autowired
	private ScoreInfoService scoreInfoService;
	@RequestMapping(value = "/add")
	public String add(Score score) {
		try {
			scoreService.add(score);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/error";
		}
		return "redirect:/score/index";
	}

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Score> findScore = scoreService.findScore();
			modelAndView.addObject("scoreAll", findScore);
			modelAndView.setViewName("score/scoreIndex");
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}

	@RequestMapping(value = "/goscoreinfo")
	public ModelAndView goscoreinfo(Integer departmentId,Integer scoreId) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<ScoreInfoCustom> scoreInfoAll = scoreInfoService.findScoreDepartment(scoreId);
			String uri = getUri(departmentId);
			modelAndView.addObject("score", scoreId);
			modelAndView.addObject("scoreInfoAll", scoreInfoAll);
			modelAndView.setViewName(uri);
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("/error");
			return modelAndView;
		}
	}

	public static String getUri(Integer id) {
		String uri;
		switch (id) {
		case 1:
			uri = "score/score_depart/hl";
			break;
		case 2:
			uri = "score/score_depart/jd";
			break;
		case 3:
			uri = "score/score_depart/ly";
			break;
		case 4:
			uri = "score/score_depart/xxIndex";
			break;
		case 5:
			uri = "score/score_depart/wy";
			break;
		case 6:
			uri = "score/score_depart/sp";
			break;
		default:
			uri = "error";
			break;
		}
		return uri;
	}

}
