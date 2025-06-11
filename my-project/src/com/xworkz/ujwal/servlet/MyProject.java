package com.xworkz.ujwal.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/click")
public class MyProject implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");

    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("ServletConfig");
        return null;


    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");

    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo");
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("destroy");

    }
}
