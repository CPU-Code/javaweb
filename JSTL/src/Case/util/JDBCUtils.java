/**
 * User: cpucode
 * Date: 2020/12/20
 * Time: 17:23
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package Case.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//JDBC工具类 使用Durid连接池

public class JDBCUtils {
    private static DataSource dataSource;

    static {
        //1.加载配置文件
        Properties properties = new Properties();

        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(inputStream);
            //2.初始化连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接池对象
    public static DataSource getDataSource(){
        return dataSource;
    }

    //获取连接Connection对象
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}

/*

create database cpucode; -- 创建数据库
use cpucode; 			   -- 使用数据库

create table `users`(   -- 创建表
	`id` int primary key auto_increment,
	`name` varchar(20) not null,
	`gender` varchar(5),
	`age` int,
	`address` varchar(32),
	`qq` varchar(20),
	`email` varchar(50)
);


insert  into `users`(
    `id`,`name`,`gender`,`age`,`address`,`qq`,`email`
)
values (
    1,'cpucode','男',13,'湖南','12345','cpucode@qq.com'
);

insert  into `users`(
    `id`,`name`,`gender`,`age`,`address`,`qq`,`email`
)
values (
    2,'cpu','女',15,'北京','666666','hahaha@qq.cn'
);


* */