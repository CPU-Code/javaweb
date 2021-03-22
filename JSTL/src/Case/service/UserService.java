/**
 * User: cpucode
 * Date: 2020/12/20
 * Time: 17:34
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package Case.service;

import Case.domain.User;

import java.util.List;

//用户管理的业务接口
public interface UserService{
    //查询所有用户信息
    public List<User> findAll();
}
