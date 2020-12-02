package json.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Map_conversion_json {
    public static void main(String[] args) throws Exception{
        //1.创建map对象
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","cpu");
        map.put("age",23);
        map.put("gender","男");

        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);

        System.out.println(json);
    }
}

/*
{"gender":"男","name":"cpu","age":23}
* */
