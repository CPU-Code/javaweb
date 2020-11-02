package cn.web.request.Post_Get_Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/Post_Get_Data")
public class Post_Get_Data extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //post 获取请求参数

        //根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("post");
        System.out.println(username);

        System.out.println();

        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
        for(String hobby : hobbies){
            System.out.print(hobby + "  ");
        }
        System.out.println();
        System.out.println();

        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.print(name + " : ");
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("---------");
        }

        System.out.println();
        System.out.println();

        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keyset = parameterMap.keySet();

        for(String name : keyset){
            String[] values = parameterMap.get(name);
            System.out.print(name + " : ");
            for(String value : values){
                System.out.print(value + " ");
            }
            System.out.println();
            System.out.println("----------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //get 获取请求参数

        //根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("get");
        System.out.println(username);

        this.doPost(request, response);
    }
}

/**
 * get
 * cpucode
 * post
 * cpucode
 *
 * game  study
 *
 * username : cpucode
 * ---------
 * password : ddd
 * ---------
 * hobby : game
 * ---------
 *
 *
 * username : cpucode
 * ----------
 * password : ddd
 * ----------
 * hobby : game study
 * ----------
 *
 */

/*
* get
cpucode
post
cpucode

game  study

username : cpucode
---------
password : ddd
---------
hobby : game
---------


username : cpucode
----------
password : ddd
----------
hobby : game study
----------

* */
