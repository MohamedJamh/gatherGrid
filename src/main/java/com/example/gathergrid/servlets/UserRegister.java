package com.example.gathergrid.servlets;

import com.example.gathergrid.conf.init.Bootstrap;
import com.example.gathergrid.domains.User;
import com.example.gathergrid.services.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "userRegister",value = "/user-register")
public class UserRegister extends HttpServlet {
    @Override
    public void init() throws ServletException {}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService.addUser(new User(
                req.getParameter("fname"),
                req.getParameter("lname"),
                req.getParameter("email"),
                req.getParameter("password")
                )
        );
    }
}
