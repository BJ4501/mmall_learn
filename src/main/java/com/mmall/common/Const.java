package com.mmall.common;

/**
 * Created by neko on 2017/6/20.
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL="email";
    public static final String USERNAME="username";

    public interface Role{
        int ROLE_CUSTIMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}