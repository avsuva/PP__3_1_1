package org.example.PP__3_1_1.web.dao;

import org.example.PP__3_1_1.web.model.UserModel;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<UserModel> allUsers() {

        return manager.createQuery("select u from UserModel u", UserModel.class).getResultList();
    }

    @Override
    public void add(UserModel user) {
        manager.persist(user);
    }

    @Override
    public void delete(int id) {
        manager.remove(getById(id));
    }

    @Override
    public void edit(int id, UserModel user) {
        manager.merge(user);
    }

    @Override
    public UserModel getById(int id) {
        return manager.find(UserModel.class, id);
    }
}
