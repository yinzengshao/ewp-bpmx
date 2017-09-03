package com.ewp.moudle.sys.mapper;

import com.ewp.entity.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {

    public List<SysUser> findPage(SysUser user);

    public SysUser get(String userName);

    public void insert(SysUser user);

    public void update(SysUser user);

    public void delete(String userName);
}