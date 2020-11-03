package cn.web.request.Get_Set_Encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get_Set_Encoding")
public class Get_Set_Encoding extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        System.out.println("post");
        String username = request.getParameter("username");
        System.out.println(username);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("get");
        this.doPost(request, response);
    }
}

/**
 * get
 * post
 * 哇哇
 * */

/**
 * post
 * 哇哇
 */