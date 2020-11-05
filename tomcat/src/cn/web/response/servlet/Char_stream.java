package cn.web.response.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/char_stream")
public class Char_stream extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取流对象之前，设置流的默认编码：ISO-8859-1 设置为：GBK
        //resp.setCharacterEncoding("UTF-8");

        //告诉浏览器，服务器发送的消息体数据的编码。建议浏览器使用该编码解码
        //resp.setHeader("content-type","text/html;charset=utf-8");

        //简单的形式，设置编码
        resp.setContentType("text/html;charset=utf-8");


        //1.获取字符输出流
        PrintWriter pw = resp.getWriter();

        //2.输出数据
        pw.write("<h1>呵呵呵呵, byte_stream</h1>");
        pw.write("哈哈哈, byte_stream");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
