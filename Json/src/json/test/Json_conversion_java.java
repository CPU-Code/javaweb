package json.test;

// JSON字符串转为Java对象

import com.fasterxml.jackson.databind.ObjectMapper;
import json.domain.Person;

public class Json_conversion_java {
    public static void main(String[] args) throws Exception{
        //1.初始化JSON字符串
        String json = "{\"gender\":\"男\",\"name\":\"cpu\",\"age\":23}";

        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);

        System.out.println(person);
    }
}

/*
Person{name='cpu', age=23, gender='男'}
* */