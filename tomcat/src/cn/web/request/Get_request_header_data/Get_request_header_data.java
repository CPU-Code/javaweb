package cn.web.request.Get_request_header_data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//获取请求头数据

@WebServlet("/Get_request_header_data")
public class Get_request_header_data extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1.获取所有请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        //2 遍历
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            //根据名称获取请求头的值
            String value = request.getHeader(name);
            System.out.println(name + "---" + value);

        }
    }
}

/**
 host---localhost:8080
 connection---keep-alive
 upgrade-insecure-requests---1
 user-agent---Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.111 Safari/537.36
 accept---text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*|*;q=0.8,application/signed-exchange;v=b3;q=0.9
        sec-fetch-site---none
        sec-fetch-mode---navigate
        sec-fetch-user---?1
        sec-fetch-dest---document
        accept-encoding---gzip, deflate, br
        accept-language---zh-CN,zh;q=0.9,en;q=0.8
        cookie---Idea-60ab846b=cce84fdc-33a8-4070-98c9-74ce86bc3cde; JSESSIONID=31FFC1EA87B17219FE7864315F32B4DD
 */
