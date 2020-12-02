package jedis;

//list 数据结构操作
// 列表类型 list ： linkedlist格式。支持重复元素

import redis.clients.jedis.Jedis;

import java.util.List;

public class Jedis_list {
    public static void main(String[] args){
        //1. 获取连接
        //如果使用空参构造，默认值 "localhost",6379端口
        Jedis jedis = new Jedis();

        //2. 操作
        // list 存储
        jedis.lpush("mylist", "a","b", "c");        //从左边存
        jedis.rpush("mylist", "d", "e", "f");        //从右边存

        // list 范围获取
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println("mylist = " + mylist);

        // list 弹出
        jedis.lpop("mylist");

        List<String> mylist2 = jedis.lrange("mylist", 0, -1);
        System.out.println("mylist2 = " + mylist2);

        jedis.rpop("mylist");

        List<String> mylist3 = jedis.lrange("mylist", 0, -1);
        System.out.println("mylist3 = " + mylist3);

        //3. 关闭连接
        jedis.close();
    }
}

/*
mylist = [c, b, a, d, e, f]
mylist2 = [b, a, d, e, f]
mylist3 = [b, a, d, e]
* */