package cn.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 在服务器中的Servlet判断是否有一个名为lastTime的cookie
 1. 有：不是第一次访问
     1. 响应数据：欢迎回来，您上次访问时间为:2020年11月07日 13:54:27
     2. 写回Cookie：lastTime=2020年11月07日 13:54:27
 2. 没有：是第一次访问
     1. 响应数据：您好，欢迎您首次访问
     2. 写回Cookie：lastTime=2020年11月07日 13:54:27
 */

@WebServlet("/cookie_test")
public class Cookie_test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应的消息体的数据格式以及编码
        resp.setContentType("text/html;charset=utf-8");

        //1.获取所有Cookie
        Cookie[] cookies = req.getCookies();
        //没有cookie为lastTime
        boolean flag = false;

        //2.遍历cookie数组
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                //3.获取cookie的名称
                String name = cookie.getName();

                //4.判断名称是否是：lastTime
                if ("lastTime".equals(name)){
                    //有该Cookie，不是第一次访问

                    flag = true;    //有lastTime的cookie

                    //设置Cookie的value
                    //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);

                    System.out.println("编码前:" + str_date);
                    //URL编码
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    System.out.println("编码后:" + str_date);
                    cookie.setValue(str_date);

                    //设置cookie的存活时间
                    cookie.setMaxAge(60 * 60 * 24 * 30);        //一个月
                    resp.addCookie(cookie);

                    //响应数据
                    //获取Cookie的value，时间
                    String value = cookie.getValue();
                    System.out.println("解码前: " + value);

                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码后: " + value);
                    resp.getWriter().write("<h1>欢迎回来，您上次访问时间为:" + value + "</h1>");

                    break;
                }
            }
        }

        if (cookies == null || cookies.length == 0 || flag == false){
            //没有，第一次访问

            //设置Cookie的value
            //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

            String str_date = sdf.format(date);
            System.out.println("编码前" + str_date);

            //URL编码
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码后:" + str_date);

            Cookie cookie = new Cookie("lastTime", str_date);
            //设置cookie的存活时间
            cookie.setMaxAge(60 * 60 * 24 * 30);        //一个月
            resp.addCookie(cookie);
            resp.getWriter().write("<h1>您好，欢迎您首次访问</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
