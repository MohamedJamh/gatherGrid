package com.example.gathergrid.servlets;

import com.example.gathergrid.conf.init.Bootstrap;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
@WebServlet(value = "/initServlet",loadOnStartup = 1)
public class initServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        Bootstrap.initialise();
    }
}
