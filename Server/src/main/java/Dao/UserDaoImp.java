package Dao;

import bean.UserBean;

public class UserDaoImp implements UserDao {
    @Override
    public UserBean getUser(int id) {
        return null;
    }

    @Override
    public boolean addUser(UserBean bean) {
        return false;
    }

    @Override
    public String getPass(String password) {
        return null;
    }

    @Override
    public boolean isExist(String name) {
        return false;
    }
}
