package com.ewp.moudle.sys.service.impl;

import com.ewp.entity.sys.SysUser;
import com.ewp.moudle.sys.mapper.SysUserMapper;
import com.ewp.moudle.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findPage(SysUser user) {
        return sysUserMapper.findPage(user);
    }

    @Override
    public SysUser get(String userName) {
        return sysUserMapper.get(userName);
    }

    @Override
    public void insert(SysUser user) {
        sysUserMapper.insert(user);
    }

    @Override
    public void update(SysUser user) {
        sysUserMapper.update(user);
    }

    @Override
    public void delete(String userName) {
        sysUserMapper.delete(userName);
    }
}
