import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document/Element对象功能
 */
public class Element_object {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = Element_object.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document= Jsoup.parse(new File(path), "UTF-8");
        //3.获取元素对象了。
        //3.1获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("----------------------");

        //3.2 获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("------------------------");

        //3.2获取 number属性值为02的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "02");
        System.out.println(elements2);
        System.out.println("------------------------");

        Element element = document.getElementById("cpu");
        System.out.println(element);
    }
}

/*
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
----------------------
<name id="cpu">
 <cpu>
  cpu
 </cpu>
 <code>code</code>
</name>
------------------------
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
------------------------
<name id="cpu">
 <cpu>
  cpu
 </cpu>
 <code>code</code>
</name>

* */