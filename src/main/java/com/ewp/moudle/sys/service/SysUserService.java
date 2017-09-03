package com.ewp.moudle.sys.service;

import com.ewp.entity.sys.SysUser;

import java.util.List;

public interface SysUserService {

    public List<SysUser> findPage(SysUser user);

    public SysUser get(String userName);

    public void insert(SysUser user);

    public void update(SysUser user);

    public void delete(String userName);
}
