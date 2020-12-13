package Case.util;

//JDBC工具类 使用Durid连接池

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            //1.加载配置文件
            Properties pro = new Properties();

            //使用ClassLoader加载配置文件，获取字节输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("./Case/druid.properties");
            pro.load(is);

            //2.初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取连接池对象
    public static DataSource getDataSource(){
        return ds;
    }

    //获取连接Connection对象
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
}

/*
CREATE DATABASE cpucode; -- 创建数据库
USE cpucode; 			   -- 使用数据库
CREATE TABLE province(   -- 创建表
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) NOT NULL

);
-- 插入数据
INSERT INTO province VALUES(NULL,'北京');
INSERT INTO province VALUES(NULL,'上海');
INSERT INTO province VALUES(NULL,'广州');
INSERT INTO province VALUES(NULL,'陕西');

* */
