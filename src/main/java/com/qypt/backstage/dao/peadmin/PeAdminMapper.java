package com.qypt.backstage.dao.peadmin;

import com.qypt.backstage.entity.peadmin.PeAdmin;
import com.qypt.backstage.entity.peadmin.PeAdminExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component
public interface PeAdminMapper {
    int countByExample(PeAdminExample example);

    int deleteByExample(PeAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(PeAdmin record);

    int insertSelective(PeAdmin record);

    List<PeAdmin> selectByExample(PeAdminExample example);

    PeAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") PeAdmin record, @Param("example") PeAdminExample example);

    int updateByExample(@Param("record") PeAdmin record, @Param("example") PeAdminExample example);

    int updateByPrimaryKeySelective(PeAdmin record);

    int updateByPrimaryKey(PeAdmin record);
}