package com.test.meteor.work.service;

import com.test.meteor.work.dao.UserJpaDao;
import com.test.meteor.work.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Meteor.wu
 * @since 2017/12/12 18:24
 */
@Service
public class UserService {

    @Autowired
    private UserJpaDao userJpaDao;

    public User getById(String id) {
        return userJpaDao.getOne(id);
    }

    public void save(User user) {
        userJpaDao.save(user);
    }

    public User update(User user){
        return userJpaDao.save(user);
    }

    public List<User> getAll() {
        return userJpaDao.findAll();
    }
}
