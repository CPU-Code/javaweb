import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 *选择器查询
 */
public class selector {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = selector.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //3.查询name标签
        /*
            div{

            }
         */

        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("-------------");

        //4.查询id值为itcast的元素
        Elements elements1 = document.select("#cpu");
        System.out.println(elements1);
        System.out.println("----------------");

        //5.获取student标签并且number属性值为02的age子标签
        //5.1.获取student标签并且number属性值为02
        Elements elements2 = document.select("student[number=\"02\"]");
        System.out.println(elements2);
        System.out.println("-------------");

        //5.2获取student标签并且number属性值为01的age子标签
        Elements elements3 = document.select("student[number=\"01\"] > age");
        System.out.println(elements3);

    }
}

/**
 * <name id="cpu">
 *  <cpu>
 *   cpu
 *  </cpu>
 *  <code>code</code>
 * </name>
 * <name>
 *  cpu_code
 * </name>
 * -------------
 * <name id="cpu">
 *  <cpu>
 *   cpu
 *  </cpu>
 *  <code>code</code>
 * </name>
 * ----------------
 * <student number="02">
 *  <name>
 *   cpu_code
 *  </name>
 *  <age>
 *   29
 *  </age>
 *  <sex>
 *   女
 *  </sex>
 * </student>
 * -------------
 * <age>
 *  20
 * </age>
 *
 **/