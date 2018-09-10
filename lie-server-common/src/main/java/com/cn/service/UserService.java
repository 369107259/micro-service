package com.cn.service;

import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Administrator
 * @CreateTime 2018/9/10 17:11
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(Long id){
        return  userMapper.selectByPrimaryKey(id);
    }

}
