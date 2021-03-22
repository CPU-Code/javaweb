/**
 * User: cpucode
 * Date: 2020/12/20
 * Time: 17:22
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package Case.dao.impl;

import Case.dao.UserDao;
import Case.domain.User;
import Case.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库...
        //1.定义sql
        String sql = "select * from users";

        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }
}
