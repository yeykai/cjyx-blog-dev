package com.yeykai.service;

import com.yeykai.bean.Users;
import com.yeykai.common.ServerRespond;
import com.yeykai.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @create by 林镇权
 * *
 * @QQ：1114031075 *
 * @时间: 2018/10/24-9:41 PM
 */
public interface IUserService {
    public ServerRespond<Users> login(String username, String password);
    public ServerRespond<String> register(Users user);
}
