package jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

//有序集合类型 sortedset：不允许重复元素，且元素有顺序

public class Jedis_sortedset {
    public static void main(String[] args){
        //1. 获取连接
        //如果使用空参构造，默认值 "localhost",6379端口
        Jedis jedis = new Jedis();

        //2. 操作
        // sortedset 存储
        jedis.zadd("mysortedset", 6, "cpu");
        jedis.zadd("mysortedset", 66, "哈哈");
        jedis.zadd("mysortedset", 55, "cpu_code");

        // sortedset 获取
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);

        System.out.println("mysortedset = " + mysortedset);

        //3. 关闭连接
        jedis.close();
    }
}

/*
mysortedset = [cpu, cpu_code, 哈哈]
* */