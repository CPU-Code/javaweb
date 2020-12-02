package jedis;

//集合类型 set  ： 不允许重复元素

import redis.clients.jedis.Jedis;

import java.util.Set;

public class Jedis_set {
    public static void main(String[] args){
        //1. 获取连接
        //如果使用空参构造，默认值 "localhost",6379端口
        Jedis jedis = new Jedis();

        //2. 操作
        // set 存储
        jedis.sadd("myset", "cpu", "哈哈" ,"cpu_code");

        // set 获取
        Set<String> myset = jedis.smembers("myset");

        System.out.println("myset = " + myset);

        //3. 关闭连接
        jedis.close();

    }
}

/*
myset = [cpu, cpu_code, 哈哈]
* */