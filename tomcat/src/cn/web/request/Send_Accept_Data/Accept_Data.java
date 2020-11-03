package cn.web.request.Send_Accept_Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Accept_Data")
public class Accept_Data extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        System.out.println("Accept_Data");

        Object msg = request.getAttribute("msg");
        System.out.println(msg);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("doPost");

        this.doGet(request, response);

    }
}

/*
doGet
send_data
doGet
Accept_Data
hello
* */