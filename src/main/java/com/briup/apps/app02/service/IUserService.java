package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();

    List<User> query(User user);

    User findById(long id);

    void saveOrUpdate(User user) throws Exception;

    void deleteById(long id) throws Exception;
}
