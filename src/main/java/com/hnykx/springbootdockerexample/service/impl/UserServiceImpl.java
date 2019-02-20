package com.hnykx.springbootdockerexample.service.impl;

import com.hnykx.springbootdockerexample.dao.UserDAO;
import com.hnykx.springbootdockerexample.model.User;
import com.hnykx.springbootdockerexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  private final UserDAO userDAO;

  @Autowired
  public UserServiceImpl(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Cacheable(value = "userListCache")
  @Override
  public List<User> findAll() {
    return userDAO.findAll();
  }
}
