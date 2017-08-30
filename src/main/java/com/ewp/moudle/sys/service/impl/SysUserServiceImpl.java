package com.ewp.moudle.sys.service.impl;

import com.ewp.entity.sys.SysUser;
import com.ewp.moudle.sys.mapper.SysUserMapper;
import com.ewp.moudle.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findPage(SysUser user) {
        return sysUserMapper.findPage(user);
    }
}
