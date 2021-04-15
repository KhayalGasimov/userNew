package com.mycompany.usernew.Service;

import com.mycompany.usernew.Model.User;

import java.util.List;

public interface UserService {
    public User saveUser( User user);
    public User updateUser(User user);

    public List<User> findAllUsers();

    public void deleteUser (int id);

}
