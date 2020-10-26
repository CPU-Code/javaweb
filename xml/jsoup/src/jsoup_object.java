import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class jsoup_object {
    public static void main(String[] args) throws IOException {
        //2.1获取student.xml的path
        String path = jsoup_object.class.getClassLoader().getResource("student.xml").getPath();

        //2.2解析xml文档，加载文档进内存，获取dom树--->Document
        Document parse = Jsoup.parse(new File(path), "UTF-8");
        System.out.println(parse);

        //2.parse​(String html)：解析xml或html字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\t<student number=\"01\">\n" +
                "\t\t<name>cpu_code</name>\n" +
                "\t\t<age>22</age>\n" +
                "\t\t<sex>女</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"02\">\n" +
                "\t\t<name>code</name>\n" +
                "\t\t<age>33</age>\n" +
                "\t\t<sex>男</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document parse1 = Jsoup.parse(str);
        System.out.println(parse1);

        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        /*
        URL url = new URL("http://jw.hieu.edu.cn/jwglxt/xtgl/login_slogin.html");     //代表网络中的一个资源路径
        Document document = Jsoup.parse(url, 5000);
        System.out.println(document);
         */
    }
}

/*
<!--?xml version="1.0" encoding="UTF-8" ?-->
<html>
 <head></head>
 <body>
  <students>
   <student number="01">
    <name id="cpu">
     <cpu>
      cpu
     </cpu>
     <code>code</code>
    </name>
    <age>
     20
    </age>
    <sex>
     男
    </sex>
   </student>
   <student number="02">
    <name>
     cpu_code
    </name>
    <age>
     29
    </age>
    <sex>
     女
    </sex>
   </student>
  </students>
 </body>
</html>
<!--?xml version="1.0" encoding="UTF-8" ?-->
<html>
 <head></head>
 <body>
  <students>
   <student number="01">
    <name>
     cpu_code
    </name>
    <age>
     22
    </age>
    <sex>
     女
    </sex>
   </student>
   <student number="02">
    <name>
     code
    </name>
    <age>
     33
    </age>
    <sex>
     男
    </sex>
   </student>
  </students>
 </body>
</html>
* */