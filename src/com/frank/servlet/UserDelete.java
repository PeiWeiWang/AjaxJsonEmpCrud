package com.frank.servlet;

import com.alibaba.fastjson.JSONObject;
import com.frank.service.UserService;
import com.frank.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delemp")
public class UserDelete  extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        JSONObject json =new JSONObject();
        try {
            userService.delet(id);
            json.put("status",200);
            json.put("msg","ok");
        }catch (Exception e) {

            json.put("status",500);
            e.printStackTrace();
        }
          resp.getWriter().write(json.toString());
    }
}
