package com.ventura.control.service.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ventura.control.domain.login.User;
import com.ventura.control.repository.login.UserDao;

@Component
public class SimpleUserManager implements UserManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao UserDao) {
        this.userDao = UserDao;
    }
    
    public List<User> getUsers() {
    	return userDao.getUserList();
    }

	public User val(String k, String p) {
		return userDao.val(k,p);
	}

	public boolean addUser(User user) {
		return userDao.addUser(user);
	}
	
	public void deleteUser(String id) {
		userDao.deleteUser(id);
	}
}