package json.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.domain.Person;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Java_conversion_json {
    public static void main(String[] args) throws Exception{
        //1.创建Person对象
        Person p = new Person();
        p.setName("cpu");
        p.setAge(22);
        p.setGender("女");
        p.setBirthday(new Date());

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
        objectMapper.writeValue(new File(".\\Json\\src\\json\\a.txt"), p);

        //writeValue.将数据关联到Writer中
        objectMapper.writeValue(new FileWriter(".\\Json\\src\\json\\b.txt"), p);

    }
}

/*
{"name":"cpu","age":22,"gender":"女","birthday":"2020-12-02"}
* */