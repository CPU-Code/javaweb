package cn.web.request.Referer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 获取请求头数据:referer
@WebServlet("/Referer")
public class Referer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String referer = request.getHeader("referer");
        System.out.println(referer);

        //防盗链
        if(referer != null){
            if(referer.contains("/request")){
                //正常访问
                System.out.println("对了对了进来了");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("对了对了进来了");
            }else{
                //盗链
                System.out.println("错了错了, 你个盗链接");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("错了错了, 你个盗链接");
            }
        }
    }
}
