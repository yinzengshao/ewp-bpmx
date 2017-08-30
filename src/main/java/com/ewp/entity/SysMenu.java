package com.ewp.entity;

import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单编码
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 父菜单编码，一级菜单为0
     */
    @Column(name = "p_menu_code")
    private String pMenuCode;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 菜单URL
     */
    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * 菜单图标
     */
    @Column(name = "menu_icon")
    private String menuIcon;

    /**
     * 排序
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * 状态(0:禁用,1:启用)
     */
    @Column(name = "menu_status")
    private String menuStatus;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取菜单编码
     *
     * @return menu_code - 菜单编码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单编码
     *
     * @param menuCode 菜单编码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 获取父菜单编码，一级菜单为0
     *
     * @return p_menu_code - 父菜单编码，一级菜单为0
     */
    public String getpMenuCode() {
        return pMenuCode;
    }

    /**
     * 设置父菜单编码，一级菜单为0
     *
     * @param pMenuCode 父菜单编码，一级菜单为0
     */
    public void setpMenuCode(String pMenuCode) {
        this.pMenuCode = pMenuCode;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取菜单URL
     *
     * @return menu_url - 菜单URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置菜单URL
     *
     * @param menuUrl 菜单URL
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 获取菜单图标
     *
     * @return menu_icon - 菜单图标
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * 设置菜单图标
     *
     * @param menuIcon 菜单图标
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * 获取排序
     *
     * @return order_num - 排序
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置排序
     *
     * @param orderNum 排序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取状态(0:禁用,1:启用)
     *
     * @return menu_status - 状态(0:禁用,1:启用)
     */
    public String getMenuStatus() {
        return menuStatus;
    }

    /**
     * 设置状态(0:禁用,1:启用)
     *
     * @param menuStatus 状态(0:禁用,1:启用)
     */
    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }
}