package com.ewp.moudle.sys.service;

import com.ewp.entity.sys.SysUser;

import java.util.List;

public interface SysUserService {

    public List<SysUser> findPage(SysUser user);
}
