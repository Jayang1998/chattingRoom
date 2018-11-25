package Dao;

import bean.UserBean;

public interface UserDao {
    UserBean getUser(int id);

    boolean addUser(UserBean bean);

    String getPass(String password);

    boolean isExist(String name);
}
