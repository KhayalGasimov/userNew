package com.mycompany.usernew.implementations;

import com.mycompany.usernew.DAO.UserRepository;
import com.mycompany.usernew.Model.User;
import com.mycompany.usernew.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public void deleteUser(int id) {
    userRepo.deleteById(id);
    }
}
