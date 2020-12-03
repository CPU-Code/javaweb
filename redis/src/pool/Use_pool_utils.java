package pool;

//jedis连接池工具类使用

import redis.clients.jedis.Jedis;
import util.Jedis_pool_utils;

public class Use_pool_utils {
    public static void main(String[] args){
        //通过连接池工具类获取
        Jedis jedis = Jedis_pool_utils.getJedis();

        //使用
        jedis.set("name", "cpu");

        //关闭 归还到连接池中
        jedis.close();

    }
}
