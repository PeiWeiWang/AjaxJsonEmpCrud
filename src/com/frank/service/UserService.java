package com.frank.service;

import com.frank.entity.User;
import java.util.List;

public interface UserService {
    List<User> query()throws Exception;
    void delet(String id)throws Exception;
}
