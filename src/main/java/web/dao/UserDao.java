package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    List<User> listUsers();

    void clearUserById(Long id);

    User searchUser(Long id);

    void update(User user);
}
