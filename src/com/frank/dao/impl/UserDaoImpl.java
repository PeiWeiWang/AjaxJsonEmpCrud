package com.frank.dao.impl;
import com.frank.dao.UserDao;
import com.frank.entity.User;
import com.frank.utils.DbConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> select() throws SQLException {
        Statement statement = DbConnect.getConnection().createStatement();
        ResultSet ret = statement.executeQuery("select * from emp");
        List<User> list = new ArrayList<>();
        while(ret.next())
        {
            User user = new User();
            user.setId(ret.getInt("empno"));
            user.setName(ret.getString("ename"));
            list.add(user);
        }
        return list;
    }

    @Override
    public boolean deleteById(String id) throws SQLException {
       Statement statement = DbConnect.getConnection().createStatement();
       statement.execute("delete from emp where empno="+id);
       return true;
    }

}
