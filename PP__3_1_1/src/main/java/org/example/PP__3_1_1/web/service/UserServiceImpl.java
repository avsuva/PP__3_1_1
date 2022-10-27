package org.example.PP__3_1_1.web.service;
import org.example.PP__3_1_1.web.dao.UserDao;
import org.example.PP__3_1_1.web.model.UserModel;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserModel> allUsers() {
        return userDao.allUsers();
    }
    @Transactional
    @Override
    public void add(UserModel user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void edit(int id, UserModel user) {
        userDao.edit(id, user);
    }

    @Override
    public UserModel getById(int id) {
        return userDao.getById(id);
    }
}