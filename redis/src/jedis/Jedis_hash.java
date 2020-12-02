package jedis;

// hash 数据结构操作

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.Set;

public class Jedis_hash {
    public static void main(String[] args){
        //1. 获取连接
        //如果使用空参构造，默认值 "localhost",6379端口
        Jedis jedis = new Jedis();

        //2. 操作
        // 存储hash
        jedis.hset("myhash","name", "cpu");
        jedis.hset("myhash", "age", "22");
        jedis.hset("myhash", "gender", "female");

        // 获取hash
        String name = jedis.hget("myhash", "name");
        System.out.println("name = " + name);

        // 获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("myhash");

        // keyset
        Set<String> keySet = user.keySet();
        for (String key : keySet){
            String value = user.get(key);

            System.out.println(key + " : " + value);
        }

        //3. 关闭连接
        jedis.close();
    }
}

/*
name = cpu
gender : female
name : cpu
age : 22
* */
