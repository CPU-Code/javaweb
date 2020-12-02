package json.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.domain.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class List_conversion_json {
    public static void main(String[] args) throws Exception{
        //1.创建Person对象
        Person p = new Person();
        p.setName("cpu");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("cpu_code");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("哈哈哈");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());


        //创建List集合
        List<Person> ps = new ArrayList<Person>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);

        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);

        System.out.println(json);
    }
}

/*
[{"name":"cpu","age":23,"gender":"男","birthday":"2020-12-02"},
{"name":"cpu_code","age":23,"gender":"男","birthday":"2020-12-02"},
{"name":"哈哈哈","age":23,"gender":"男","birthday":"2020-12-02"}]
* */