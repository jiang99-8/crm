package com.neusoft.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.crm.entity.SysUser;
import com.neusoft.crm.service.SysUserService;

@RestController
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("selectSysUserByNameByPass")
	public SysUser selectSysUserByNameByPass(@RequestBody SysUser sysuser) throws Exception{
		return sysUserService.selectSysUserByNameByPass(sysuser);
	}
	

}
