package com.neusoft.crm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.crm.entity.SysUser;

@Mapper
public interface SysUserMapper {
	@Select("select * from sysuser where userName=#{userName} and userPassword=#{userPassword}")
	public SysUser selectSysUserByNameByPass(SysUser sysuser);

}
