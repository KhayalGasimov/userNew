package com.mycompany.usernew.DAO;

import com.mycompany.usernew.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
