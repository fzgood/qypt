package com.qypt.backstage.dao.course;

import com.qypt.backstage.entity.course.Courseinformation;
import com.qypt.backstage.entity.course.CourseinformationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component
public interface CourseinformationMapper {
    int countByExample(CourseinformationExample example);

    int deleteByExample(CourseinformationExample example);

    int deleteByPrimaryKey(Integer ciId);

    int insert(Courseinformation record);

    int insertSelective(Courseinformation record);

    List<Courseinformation> selectByExample(CourseinformationExample example);

    Courseinformation selectByPrimaryKey(Integer ciId);

    int updateByExampleSelective(@Param("record") Courseinformation record, @Param("example") CourseinformationExample example);

    int updateByExample(@Param("record") Courseinformation record, @Param("example") CourseinformationExample example);

    int updateByPrimaryKeySelective(Courseinformation record);

    int updateByPrimaryKey(Courseinformation record);
}