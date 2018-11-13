package com.frank.service.impl;

import com.frank.dao.UserDao;
import com.frank.dao.impl.UserDaoImpl;
import com.frank.entity.User;
import com.frank.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> query() throws Exception {
        return userDao.select();
    }

    @Override
    public void delet(String id) throws Exception {
        boolean ret = userDao.deleteById(id);
    }

}
