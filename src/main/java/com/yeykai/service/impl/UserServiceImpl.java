package com.yeykai.service.impl;

import com.yeykai.bean.Users;
import com.yeykai.common.ServerRespond;
import com.yeykai.dao.UsersMapper;
import com.yeykai.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/24-9:41 PM
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
  private   UsersMapper usersMapper;

    /**
    *@desc:登录实现接口
    *
    *@author:Qroxy
    *
    *@date:2018/10/24 9:54 PM
    *
    *@param:[username, password]
    *
    *@type:com.yeykai.common.ServerRespond<com.yeykai.bean.Users>
    *
    */
    @Override
    public ServerRespond<Users> login(String username, String password) {

        Users user = usersMapper.selectByUserAndPassword(username, password);
        if (user == null) {
            return ServerRespond.createByErrorMessage("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerRespond.createBySuccess("登录成功", user);

    }

    @Override
    public ServerRespond<String> register(Users user){
        //todo 校验是否已经存在用户和邮箱
        String id=Sid.next();
        user.setId(id);

        int resultCount = usersMapper.insertSelective(user);
        if (resultCount == 0) {
            return ServerRespond.createByErrorMessage("注册失败");
        }
        return ServerRespond.createBySuccessMessage("注册成功");

    }


}
