package com.hnykx.springbootdockerexample.service;

import com.hnykx.springbootdockerexample.model.User;

import java.util.List;

public interface UserService {
  List<User> findAll();
}
