package cn.web.servlet_context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get_context")
public class Get_context extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        ServletContext对象获取：
            1. 通过request对象获取
                request.getServletContext();
            2. 通过HttpServlet获取
                this.getServletContext();
         */

        //1. 通过request对象获取
        ServletContext context = req.getServletContext();
        ServletContext context2 = this.getServletContext();

        System.out.println(context);
        System.out.println(context2);

        System.out.println(context == context2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
