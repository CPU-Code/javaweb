package jedis;

import redis.clients.jedis.Jedis;

public class Jedis_first {
    public static void main(String[] args){
        //1. 获取连接
        Jedis jedis = new Jedis("localhost", 6379);

        //2. 操作
        jedis.set("username", "cpucode");

        //3. 关闭连接
        jedis.close();
    }
}
