package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.User;

import java.util.*;

public interface UserMapper {

    List<User> selectAll();

    List<User> query(User user);

    User selectByPrimaryKey(long id);

    void insert(User user);

    void update(User user);

    void deleteByPrimaryKey(long id);
}
