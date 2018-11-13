package com.frank.utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnect {
    private static DruidDataSource dataSource;
    static {
        dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@//127.0.0.1:1521/orcl");
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUsername("scott");
        dataSource.setPassword("tiger");
    }

    public static Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();
    }

}
