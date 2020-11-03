package cn.web.request.Get_Context;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get_Context")
public class Get_Context extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        ServletContext servletContext = request.getServletContext();

        System.out.println(servletContext);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        this.doPost(request, response);
    }
}

/*
* org.apache.catalina.core.ApplicationContextFacade@363a17c3
* */