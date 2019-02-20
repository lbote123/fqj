package com.hnykx.springbootdockerexample.controller;

import com.hnykx.springbootdockerexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String index(ModelMap modelMap) {
    modelMap.put("userList", userService.findAll());
    return "index";
  }

}
