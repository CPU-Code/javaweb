/**
 * User: cpucode
 * Date: 2020/12/20
 * Time: 17:35
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package Case.service.impl;

import Case.dao.UserDao;
import Case.dao.impl.UserDaoImpl;
import Case.domain.User;
import Case.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll(){
        //调用Dao完成查询
        return dao.findAll();
    }
}
