package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.model.User;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import java.util.List;
@Repository
public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);
}