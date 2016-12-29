package com.ilearn.example.spring.mvc.conf.model;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-29
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
public enum UserState {

    normal("正常状态"), blocked("锁定");

    private String desc;
    private UserState(String desc) {
        this.desc = desc;;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }

}