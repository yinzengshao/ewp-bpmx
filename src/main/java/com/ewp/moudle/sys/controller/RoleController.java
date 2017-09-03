package com.ewp.moudle.sys.controller;

import com.ewp.entity.sys.SysUser;
import com.ewp.moudle.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/role/")
public class RoleController {
    private static String PREFIX = "/sys/role/";

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/list")
    public String list(Model model, SysUser user) {
        model.addAttribute("title", "用户管理");
        model.addAttribute("users", sysUserService.findPage(user));
        return PREFIX + "list.html";
    }
}
