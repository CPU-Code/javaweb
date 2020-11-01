package cn.web.Servlet_method;

import javax.servlet.*;
import java.io.IOException;

public class Servlet_method implements Servlet {
    private int age = 3;

    /**
     *  初始化方法
     *  在Servlet被创建时，执行。只会执行一次
     * */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet_method init");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时，执行。执行多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet_method service");
        int number = 3;
    }

    /**
     * 获取Servlet的一些信息，版本，作者等等。。
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时，执行，执行一次。
     */
    @Override
    public void destroy() {
        System.out.println("Servlet_method destroy");
    }
}
