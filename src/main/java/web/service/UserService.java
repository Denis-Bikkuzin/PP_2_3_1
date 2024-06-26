package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(int id);

    User getUser(int id);

    void updateUser(User user);
}
