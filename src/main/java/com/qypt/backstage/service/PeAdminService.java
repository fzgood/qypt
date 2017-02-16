package com.qypt.backstage.service;

import com.qypt.backstage.entity.peadmin.PeAdmin;

public interface PeAdminService {
	/**
	 * 根据账号密码 登录
	 * @param admin 账号对象
	 * @return 返回对象
	 * @throws Exception 异常处理
	 */
	public PeAdmin findAdminUserPass(PeAdmin admin) throws Exception;

}
