package jedis;

//string 数据结构操作
// 字符串类型 string

import redis.clients.jedis.Jedis;

public class Jedis_string {
    public static void main(String[] args){
        //1. 获取连接
        //如果使用空参构造，默认值 "localhost",6379端口
        Jedis jedis = new Jedis();

        //2. 操作
        //存储
        jedis.set("username","cpucode");

        //获取
        String username = jedis.get("username");
        System.out.println("username = " + username);

        //可以使用setex()方法存储可以指定过期时间的 key value
        //将 activecode：cpu 键值对存入 redis，并且5秒后自动删除该键值对
        jedis.setex("activecode", 5, "cpu");

        //3. 关闭连接
        jedis.close();

    }
}

/*
username = cpucode
* */