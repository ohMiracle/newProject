package com.newroad.service.imp;

import com.newroad.dao.UserMapper;
import com.newroad.entity.User;
import com.newroad.service.UserServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserServiceIf{
    @Resource
    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.selectUsers();
    }
}
