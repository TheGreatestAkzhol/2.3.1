package org.tomik.project.service;

import org.tomik.project.model.User;

import java.util.List;

public interface UserServiceInterface {
    public List<User> findAll();
    public User findOne(int id);
    public void save(User user);
    public void update(int id,User user);
    public void delete(int id);
}
