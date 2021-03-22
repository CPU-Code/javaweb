package Case.dao;

import Case.domain.User;

import java.util.List;

//用户操作的DAOca
public interface UserDao{
    public List<User> findAll();
}