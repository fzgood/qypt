package com.qypt.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qypt.backstage.dao.peadmin.PeAdminMapper;
import com.qypt.backstage.entity.peadmin.PeAdmin;
import com.qypt.backstage.entity.peadmin.PeAdminExample;
import com.qypt.backstage.entity.peadmin.PeAdminExample.Criteria;
import com.qypt.backstage.service.PeAdminService;

public class PeAdminServiceImpl implements PeAdminService {
	@Autowired
	private PeAdminMapper peAdminMapper;
	@Override
	public PeAdmin findAdminUserPass(PeAdmin admin) throws Exception {
		PeAdminExample example=new PeAdminExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andAdminNameEqualTo(admin.getAdminName());
		createCriteria.andAdminPassEqualTo(admin.getAdminPass());
		List<PeAdmin> peAdminList = peAdminMapper.selectByExample(example);
		if(peAdminList.size()>0){
			return peAdminList.get(0);
		}
		return null;
	}

}
