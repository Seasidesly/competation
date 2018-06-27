package com.kunpeng.competition.service.impl;

import com.kunpeng.competition.domain.User;
import com.kunpeng.competition.domain.UserRepository;
import com.kunpeng.competition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findUserById(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
