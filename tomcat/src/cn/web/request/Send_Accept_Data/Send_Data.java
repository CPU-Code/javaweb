package cn.web.request.Send_Accept_Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Send_Data")
public class Send_Data extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        System.out.println("send_data");

        /*
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
        requestDispatcher.forward(request,response);
        */

        request.setAttribute("msg", "cpu_code");
        request.getRequestDispatcher("/Accept_Data").forward(request, response);

        //request.getRequestDispatcher("https://github.com/CPU-Code").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("doPost");
        this.doGet(request, response);
    }
}
