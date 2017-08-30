package com.ewp.moudle.sys.service.impl;

import com.ewp.entity.sys.SysMenu;
import com.ewp.moudle.sys.mapper.SysMenuMapper;
import com.ewp.moudle.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> findMenuTree() {
        Map<String, String> params = new HashMap<>();
        params.put("pMenuCode","0");
        return sysMenuMapper.findMenuTree(params);
    }

}
