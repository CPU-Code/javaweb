package Case.web.servlet;


import Case.service.ProvinceService;
import Case.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        //1.调用service查询
        ProvinceService service = new ProvinceServiceImpl();
        List<Province> list = service.findAll();

        //2.序列化list为json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        */

        //1.调用service查询
        ProvinceService service = new ProvinceServiceImpl();

        String json = service.findAllJson();

        System.out.println("json = " + json);

        //3.响应结果
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
