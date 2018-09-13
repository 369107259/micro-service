package com.cn.service;

import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> findAll() {
        PageHelper.startPage(1,2);
        return userMapper.selectAll();
    }

}
