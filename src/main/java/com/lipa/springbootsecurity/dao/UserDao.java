package com.lipa.springbootsecurity.dao;



import com.lipa.springbootsecurity.model.Role;
import com.lipa.springbootsecurity.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void updateUserById(long id, String firstName, String lastName,
                               byte age, String email, String password, List<Role> roles);

    User findByUsername(String username);

    User findById(long id);

    Set<Role> getRoles();
}
