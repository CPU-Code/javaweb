package cn.web.response.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect")
public class Redirect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Redirect...");

        /*
        //访问/Redirect，会自动跳转到/accept_redirect资源
        //设置状态码为302
        // 302(重定向)
        resp.setStatus(302);
        //2.设置响应头location
        resp.setHeader("location", "/response/accept_redirect");

        */
        // 不能使用request对象来共享数据
        req.setAttribute("msg","response");

        //动态获取虚拟目录
        String contextPath = req.getContextPath();

        //访问当前服务器下的资源
        resp.sendRedirect(contextPath + "/accept_redirect");

        //重定向可以访问其他站点(服务器)的资源
        //resp.sendRedirect("https://github.com/CPU-Code");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
