package com.ewp.moudle.sys.controller;

import com.ewp.entity.sys.SysUser;
import com.ewp.moudle.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sys/user")
public class UserController {
    private static String PREFIX = "/sys/user/";

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/list")
    public String list(Model model, SysUser user) {
        model.addAttribute("title", "用户管理");
        model.addAttribute("users", sysUserService.findPage(user));
        return PREFIX + "list.html";
    }

    @RequestMapping("/add")
    public String add(SysUser user) {
        return PREFIX + "form.html";
    }

    @RequestMapping("/save")
    public void save(SysUser user) {
        sysUserService.insert(user);
    }

    @RequestMapping("/update")
    public String update(Model model, SysUser user) {
        model.addAttribute("user", user);
        return PREFIX + "form.html";
    }

    @RequestMapping("/edit")
    public void edit(SysUser user) {
        sysUserService.update(user);
    }
}
