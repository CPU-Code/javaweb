package json.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.domain.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class JacksonTest {

    //导入jackson的相关jar包

    @Test
    public void test1() throws Exception{
        //1.创建Person对象
        Person p = new Person();
        p.setName("cpu");
        p.setAge(22);
        p.setGender("女");

        //.创建Jackson的核心对象  ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        /*
        3.转换
        转换方法：
            writeValue(参数1，obj):
                参数1：
                    File：将obj对象转换为JSON字符串，并保存到指定的文件中
                    Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
                    OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
            writeValueAsString(obj):将对象转为json字符串
         */
        String json = objectMapper.writeValueAsString(p);
        System.out.println(json);

        //writeValue，将数据写到d://a.txt文件中
        objectMapper.writeValue(new File("src//json//a.txt"), p);

        //writeValue.将数据关联到Writer中
        objectMapper.writeValue(new FileWriter("src//json//b.txt"), p);
    }

    /*
    2. 注解：
        1. @JsonIgnore：排除属性。
        2. @JsonFormat：属性值得格式化
            * @JsonFormat(pattern = "yyyy-MM-dd")
    * */
    @Test
    public void test2() throws Exception{
        //1.创建Person对象
        Person p = new Person();

        p.setName("cpu_code");
        p.setAge(33);
        p.setGender("男");
        p.setBirthday(new Date());

        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);

        System.out.println("json = " + json);
    }
}
