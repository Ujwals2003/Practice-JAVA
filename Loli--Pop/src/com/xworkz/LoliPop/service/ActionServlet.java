package com.xworkz.LoliPop.service;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/run",loadOnStartup = 1)
public class ActionServlet extends GenericServlet {

   public ActionServlet()
    {
        System.out.println("mmmmmmm");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running");
    }
}
