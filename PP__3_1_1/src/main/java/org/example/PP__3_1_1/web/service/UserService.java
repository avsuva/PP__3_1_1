package org.example.PP__3_1_1.web.service;
import org.example.PP__3_1_1.web.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> allUsers();
    void add(UserModel user);
    void delete(int id);
    void edit(int id, UserModel user);
    UserModel getById(int user);
}
