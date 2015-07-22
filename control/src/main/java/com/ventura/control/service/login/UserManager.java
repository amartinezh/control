 package com.ventura.control.service.login;

 
import java.io.Serializable;
import java.util.List;

import com.ventura.control.domain.login.User;

public interface UserManager extends Serializable {

    public List<User> getUsers();
    public User val(String k, String p);
    public boolean addUser(User user);
    public void deleteUser(String id);

}