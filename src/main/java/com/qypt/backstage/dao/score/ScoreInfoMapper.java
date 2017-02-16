package com.qypt.backstage.dao.score;

import com.qypt.backstage.entity.score.ScoreInfo;
import com.qypt.backstage.entity.score.ScoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreInfoMapper {
    int countByExample(ScoreInfoExample example);

    int deleteByExample(ScoreInfoExample example);

    int insert(ScoreInfo record);

    int insertSelective(ScoreInfo record);

    List<ScoreInfo> selectByExample(ScoreInfoExample example);

    int updateByExampleSelective(@Param("record") ScoreInfo record, @Param("example") ScoreInfoExample example);

    int updateByExample(@Param("record") ScoreInfo record, @Param("example") ScoreInfoExample example);
}