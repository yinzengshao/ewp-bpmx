package com.ewp.moudle.sys.service;

import com.ewp.entity.sys.SysMenu;

import java.util.List;

public interface SysMenuService {

    public List<SysMenu> findMenuTree();
}
