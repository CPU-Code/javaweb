package cn.web.servlet_context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get_path")
public class Get_path extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        ServletContext功能：
           1. 获取MIME类型：
            2. 域对象：共享数据
            3. 获取文件的真实(服务器)路径
         */

        // 通过HttpServlet获取
        ServletContext context = this.getServletContext();

        // 获取文件的服务器路径
        //web目录下资源访问
        String c = context.getRealPath("/c.txt");
        System.out.println(c);
        // File file = new File(realPath);

        //WEB-INF目录下的资源访问
        String b = context.getRealPath("/WEB-INF/b.txt");
        System.out.println(b);

        //src目录下的资源访问
        String a = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
