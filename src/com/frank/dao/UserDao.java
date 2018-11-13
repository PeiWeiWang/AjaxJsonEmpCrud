package com.frank.dao;

import com.frank.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
 List<User> select()throws SQLException;
  boolean deleteById(String id)throws SQLException;
}
