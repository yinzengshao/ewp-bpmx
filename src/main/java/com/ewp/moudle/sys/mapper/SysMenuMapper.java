package com.ewp.moudle.sys.mapper;

import com.ewp.entity.sys.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuMapper {

    public List<SysMenu> findMenuTree(Map<String, String> params);
}
