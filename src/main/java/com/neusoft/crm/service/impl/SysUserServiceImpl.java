package com.neusoft.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.mapper.SysUserMapper;
import com.neusoft.crm.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public SysUser selectSysUserByNameByPass(SysUser sysuser) {		
		return sysUserMapper.selectSysUserByNameByPass(sysuser);
	}

}
