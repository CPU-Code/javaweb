package cn.web.request.Browser_version;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Browser_version")
public class Browser_version extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String agent = request.getHeader("user-agent");

        if(agent.contains("Chrome")){
            System.out.println("谷歌呵呵");
        }
        else if(agent.contains("Firefox")){
            System.out.println("火狐哈哈");
        }
        else if(agent.contains("Edg")){
            System.out.println("微软哇哇");
        }
    }
}

/*
* Connected to server
[2020-11-01 11:12:19,848] Artifact tomcat:war exploded: Artifact is being deployed, please wait...
[2020-11-01 11:12:20,177] Artifact tomcat:war exploded: Artifact is deployed successfully
[2020-11-01 11:12:20,178] Artifact tomcat:war exploded: Deploy took 330 milliseconds
谷歌呵呵
* */