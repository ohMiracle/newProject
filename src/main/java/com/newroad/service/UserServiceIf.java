package com.newroad.service;

import com.newroad.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserServiceIf {
    List<User> getUsers();
}
