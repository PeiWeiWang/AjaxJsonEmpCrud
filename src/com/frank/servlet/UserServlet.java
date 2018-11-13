package com.frank.servlet;

import com.alibaba.fastjson.JSONObject;
import com.frank.entity.User;
import com.frank.service.UserService;
import com.frank.service.impl.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/showemp")
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JSONObject json = new JSONObject();
        List<User> ret = new ArrayList<>();
        try {
            ret = userService.query();
            json.put("empinfo", ret);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        resp.getWriter().write(json.toString());
    }
}
