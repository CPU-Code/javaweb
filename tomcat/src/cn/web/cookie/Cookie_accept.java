package cn.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie_accept")
public class Cookie_accept extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //3. 获取Cookie
        Cookie[] cs = req.getCookies();

        //获取数据，遍历Cookies
        if(cs != null){
            for (Cookie c : cs){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name + " : " + value);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
